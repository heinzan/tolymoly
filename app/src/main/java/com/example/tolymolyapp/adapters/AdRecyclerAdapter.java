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
import com.example.tolymolyapp.service.model.AdsVO;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdRecyclerAdapter extends RecyclerView.Adapter<AdRecyclerAdapter.CustomViewHolder> {
    List<AdsVO> adsVoList;
    Context mContext;
    public AdRecyclerAdapter(List<AdsVO> list, Context context){
        adsVoList = list;
        mContext = context;
    }
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_ads, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
       // holder.textUser.setText(dataList.get(position).getUser());
        holder.txt_price.setText(String.valueOf(adsVoList.get(position).getPrice()));
        holder.txt_user_name.setText(adsVoList.get(position).getUser_name());
        holder.txt_title.setText(adsVoList.get(position).getTitle());

        String coverUrl = adsVoList.get(position).getCoverImage();
        String profileUrl = adsVoList.get(position).getUser_image();
        Picasso.get().load(coverUrl).fit().centerCrop()
                .into(holder.iv_cover);

        if (profileUrl == null){
            Picasso.get().load(R.drawable.user_head).fit().centerCrop().into(holder.profile_image);
        }else {
            Picasso.get().load(profileUrl).fit().centerCrop().into(holder.profile_image);
        }




    }

    @Override
    public int getItemCount() {
        return adsVoList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView profile_image;
        TextView txt_user_name , txt_title , txt_price;
        ImageView iv_cover;


        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            profile_image = itemView.findViewById(R.id.civ_ad_user_image);
            txt_user_name = itemView.findViewById(R.id.tv_ad_user_name);
            iv_cover = itemView.findViewById(R.id.iv_ads_cover);
            txt_title = itemView.findViewById(R.id.tv_ad_title);
            txt_price = itemView.findViewById(R.id.tv_ad_price);

        }
    }
}
