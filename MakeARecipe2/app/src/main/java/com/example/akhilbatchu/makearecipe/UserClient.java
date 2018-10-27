package com.example.akhilbatchu.makearecipe;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface UserClient {



    @GET("users/{user}/repos")
    Call<List<userrepo>> reposForUser(@Path("user") String user);

    @Multipart
    @POST("/imageupload")
    Call<ResponseBody> postImage(@Part MultipartBody.Part image);
}
