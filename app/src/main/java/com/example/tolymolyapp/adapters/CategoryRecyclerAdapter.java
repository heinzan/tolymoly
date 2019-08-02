package com.example.tolymolyapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tolymolyapp.R;
import com.example.tolymolyapp.service.model.CategoryVO;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CategoryRecyclerAdapter extends RecyclerView.Adapter<CategoryRecyclerAdapter.CustomViewHolder> {

    List<CategoryVO> categoryVOList;
    Context mContext;

    public CategoryRecyclerAdapter(List<CategoryVO> list , Context context){
        categoryVOList = list;
        mContext = context;
    }
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_category, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.txt_category.setText(categoryVOList.get(position).getName());

        boolean hasQuality = categoryVOList.get(position).isHasQuantity();

        if(hasQuality == true){
            Picasso.get().load(R.drawable.woman_fashion).into(holder.img_category);
        }


    }

    @Override
    public int getItemCount() {
        return categoryVOList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView img_category;
        TextView txt_category;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            img_category = itemView.findViewById(R.id.img_category);
            txt_category = itemView.findViewById(R.id.tv_category);


        }
    }
}
