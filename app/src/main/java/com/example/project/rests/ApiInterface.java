package com.example.project.rests;
import com.example.project.model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface ApiInterface {
        @GET("top-headlines")
        Call<ResponseModel> getLatestNews(@Query ("sources") String source, @Query("apiKey") String apiKey);
    }

