package com.project.watchnow;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ComingSoon extends Fragment {
    String apikey = "k_zhtm1r5u";
    ArrayList<MovieDetail> movieArrayList;
    RecyclerViewAdapter adapter;

    public ComingSoon() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        @SuppressLint("InflateParams") View v = inflater.inflate(R.layout.item_list, null);
        RecyclerView recyclerViewNowPlaying = v.findViewById(R.id.recycler);
        movieArrayList =new ArrayList<>();
        recyclerViewNowPlaying.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new RecyclerViewAdapter(getContext(), movieArrayList);
        recyclerViewNowPlaying.setAdapter(adapter);

        findMovie();
        return v;
    }

    private void findMovie() {
        API.getApiInterface().getMovieSoon(apikey).enqueue(new Callback<Movie>() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(@NonNull Call<Movie> call, @NonNull Response<Movie> response) {
                if (response.isSuccessful()){
                    assert response.body() != null;
                    movieArrayList.addAll(response.body().getItems());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(@NonNull Call<Movie> call, @NonNull Throwable t) {
                Log.d("Coming Soon", "error");
            }
        });
    }
}
