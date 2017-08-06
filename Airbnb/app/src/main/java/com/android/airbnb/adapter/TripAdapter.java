package com.android.airbnb.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.android.airbnb.R;
import com.android.airbnb.data.House_images;
import com.android.airbnb.data.RoomsData;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by MDY on 2017-08-05.
 */

public class TripAdapter extends RecyclerView.Adapter<TripAdapter.Holder> {

    List<RoomsData> data;
    LayoutInflater inflater;

    public TripAdapter(Context context, List<RoomsData> data){
        this.data = data;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.trip_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        RoomsData roomsData = data.get(position);
        holder.setPrice(roomsData.getPrice_per_day());
        holder.setIntroduce(roomsData.getIntroduce());
        holder.setRoomType(roomsData.getRoom_type());

        House_images[] images = roomsData.getHouse_images();
        Glide.with(inflater.getContext())
                .load(images.length > 0 ? images[0].getImage() : null)
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        TextView txtPrice, txtIntroduce, txtRoomType, txtReview, txtReviewCount;
        ImageView img;
        // ImageButton imgBtnHeart;
        RatingBar ratingBar;

        public Holder(View itemView) {
            super(itemView);
            txtPrice = (TextView) itemView.findViewById(R.id.txtPrice);
            txtIntroduce = (TextView) itemView.findViewById(R.id.txtIntroduce);
            txtRoomType = (TextView) itemView.findViewById(R.id.txtRoomType);
            txtReview = (TextView) itemView.findViewById(R.id.txtReview);
            txtReviewCount = (TextView) itemView.findViewById(R.id.txtReviewCount);
            img = (ImageView) itemView.findViewById(R.id.img);
            // imgBtnHeart = (ImageButton) itemView.findViewById(R.id.imgBtnHeart);
            ratingBar = (RatingBar) itemView.findViewById(R.id.ratingBar);
        }

        private void setPrice(String price){
            txtPrice.setText(price + " 원");
        }
        private void setIntroduce(String introduce){
            txtIntroduce.setText(introduce);
        }
        private void setRoomType(String roomType){
            txtRoomType.setText(roomType);
        }
    }
}
