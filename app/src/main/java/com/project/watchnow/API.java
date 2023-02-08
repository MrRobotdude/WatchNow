package com.project.watchnow;

import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {
    public static Retrofit retrofit=null;

    public static IAPI getApiInterface(){

        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(IAPI.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(IAPI.class);
    }
}
