package com.example.tolymolyapp.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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


        boolean hasQuality = categoryVOList.get(position).isHasQuantity();
        int id = categoryVOList.get(position).getId();

        for (int i = 0; i<categoryVOList.size() ;i++){
            if(hasQuality == true){
                if(id == 1){
                    Picasso.get().load(R.drawable.woman_fashion).fit().centerCrop().into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 50){
                    Picasso.get().load(R.drawable.man_fashion).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 83){
                    Picasso.get().load(R.drawable.home_appliance).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 136){
                    Picasso.get().load(R.drawable.watch).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 141){
                    Picasso.get().load(R.drawable.mobile_gadget).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 181){
                    Picasso.get().load(R.drawable.computer).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 226){
                    Picasso.get().load(R.drawable.car).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 230){
                    Picasso.get().load(R.drawable.motorbike).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 234){
                    Picasso.get().load(R.drawable.ticket_voucher).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 238){
                    Picasso.get().load(R.drawable.book_stationary).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 245){
                    Picasso.get().load(R.drawable.beauty_service).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 253){
                    Picasso.get().load(R.drawable.toy_game).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 263){
                    Picasso.get().load(R.drawable.baby_kid).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 271){
                    Picasso.get().load(R.drawable.sport_outdoor).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 277){
                    Picasso.get().load(R.drawable.pet_supply).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 281){
                    Picasso.get().load(R.drawable.music_media).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 286){
                    Picasso.get().load(R.drawable.hobby_collect).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 293){
                    Picasso.get().load(R.drawable.gardening).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 299){
                    Picasso.get().load(R.drawable.food_drink).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 305){
                    Picasso.get().load(R.drawable.home_furniture).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 335){
                    Picasso.get().load(R.drawable.service).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 348){
                    Picasso.get().load(R.drawable.job).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }else if(id == 370){
                    Picasso.get().load(R.drawable.everytihing_else).into(holder.img_category);
                    holder.txt_category.setText(categoryVOList.get(position).getName());
                }

            }
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

            img_category.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(mContext , "Click ID"+categoryVOList.get(getAdapterPosition()).getId() , Toast.LENGTH_LONG).show();
                }
            });


        }
    }
}
