package com.smartdroidesign.staggeredrecyclerview.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.smartdroidesign.staggeredrecyclerview.R;

public class Holder extends RecyclerView.ViewHolder {

    public ImageView image;
    public TextView text;

    public Holder(@NonNull View itemView) {
        super(itemView);
        this.image = itemView.findViewById(R.id.images);
        this.text = itemView.findViewById(R.id.names);


    }
}
