package com.smartdroidesign.staggeredrecyclerview.presenter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.smartdroidesign.staggeredrecyclerview.R;
import com.smartdroidesign.staggeredrecyclerview.model.Holder;
import com.smartdroidesign.staggeredrecyclerview.view.GalleryActivity;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Holder> {

    private ArrayList<String> names;
    private ArrayList<String> imageUrls;
    private Context context;

    public Adapter(Context context, ArrayList<String> names, ArrayList<String> images) {
        this.names = names;
        this.imageUrls = images;
        this.context = context;
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_items, viewGroup, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Holder holder, final int i) {
        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background);

        Glide.with(context)
                .load(imageUrls.get(holder.getAdapterPosition()))
                .apply(requestOptions)
                .into(holder.image);

        holder.text.setText(names.get(holder.getAdapterPosition()));
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Intent intent = new Intent(context, GalleryActivity.class);
                intent.putExtra("image_url", imageUrls.get(position));
                intent.putExtra("image_name", names.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return imageUrls.size();
    }
}
