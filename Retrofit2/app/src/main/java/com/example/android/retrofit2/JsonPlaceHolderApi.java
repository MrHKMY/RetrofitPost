package com.example.android.retrofit2;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Hakimi on 4/2/2020.
 */
public interface JsonPlaceHolderApi {

    @POST("posts")
    Call<Post> createPost(@Body Post post);
}
