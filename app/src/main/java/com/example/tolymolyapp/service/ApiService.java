package com.example.tolymolyapp.service;

import com.example.tolymolyapp.service.model.AdsVO;
import com.example.tolymolyapp.service.model.CategoryVO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("ads/index")
    Call<List<AdsVO>> getAds();

    @GET("ads/categories")
    Call<List<CategoryVO>> getCategory();
}
