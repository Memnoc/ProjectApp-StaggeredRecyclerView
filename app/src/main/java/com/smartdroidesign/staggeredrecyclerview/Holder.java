package com.smartdroidesign.staggeredrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

class Holder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView text;

    Holder(@NonNull View itemView) {
        super(itemView);
        this.image = itemView.findViewById(R.id.images);
        this.text = itemView.findViewById(R.id.names);
    }
}
