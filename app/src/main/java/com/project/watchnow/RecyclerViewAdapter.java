package com.project.watchnow;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.TimeZone;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    Context context;
    ArrayList<MovieDetail> movieArrayList;

    public RecyclerViewAdapter(Context context, ArrayList<MovieDetail> modelArrayList) {
        this.context = context;
        this.movieArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams") View view = LayoutInflater.from(context).inflate(R.layout.item, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.cardView.setOnClickListener(v -> {
            Intent intent = new Intent(context, WebView.class);
            intent.putExtra("url", movieArrayList.get(position).getId());
            context.startActivity(intent);
        });
        Log.d("cek movie", "judul : " + movieArrayList.get(position).getTitle());
        holder.ddirector.setText(movieArrayList.get(position).getDirectors());
        holder.ttitle.setText(movieArrayList.get(position).getTitle());
        holder.pplot.setText(movieArrayList.get(position).getPlot());
        holder.rrating.setText(movieArrayList.get(position).getIMDbRating());
        Glide.with(context).load(movieArrayList.get(position).getImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return movieArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView ttitle, pplot, ddirector, rrating;
        CardView cardView;
        ImageView imageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ttitle=itemView.findViewById(R.id.title);
            pplot=itemView.findViewById(R.id.plot);
            ddirector=itemView.findViewById(R.id.director);
            rrating=itemView.findViewById(R.id.rating);
            imageView=itemView.findViewById(R.id.imageview);
            cardView=itemView.findViewById(R.id.cardview);

        }
    }
}
