package com.project.watchnow;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IAPI {
    String BASE_URL="https://imdb-api.com/en/API/";

    @GET("InTheaters")
    Call<Movie> getMovie(
            @Query("apiKey") String apikey
    );

    @GET("ComingSoon")
    Call<Movie> getMovieSoon(
            @Query("apiKey") String apikey
    );
}
