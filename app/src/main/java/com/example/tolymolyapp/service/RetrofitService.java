package com.example.tolymolyapp.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {
    private static Retrofit retrofit = null;
    private static Gson gson = new GsonBuilder().create();
    private static String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxIiwiaWF0IjoxNTY0MTI1MjA2LCJleHAiOjE1OTU2ODIxNTh9.2VHLA-MiWUpCL7vCou2vis2v6g4ffSeDNi7Ld40wFRo";

    public static Retrofit getRetrofitInstance() {
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        okHttpClient.addInterceptor(new Interceptor() {
            @NotNull
            @Override
            public Response intercept(@NotNull Chain chain) throws IOException {
                Request request = chain.request();
               Request.Builder newRequest =  request.newBuilder().header("Authorization" , "Bearer "+token);

                return chain.proceed(newRequest.build());

            }
        });
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .client(okHttpClient.build())
                    .baseUrl(AppUrl.getHttpUrl())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
}

