package com.example.tolymolyapp.service;

import com.example.tolymolyapp.service.model.AdsDetailVO;
import com.example.tolymolyapp.service.model.AdsVO;
import com.example.tolymolyapp.service.model.CategoryVO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("ads/index")
    Call<List<AdsVO>> getAds();

    @GET("ads/categories")
    Call<List<CategoryVO>> getCategory();

    @GET("ads/{id}")
    Call<AdsDetailVO> getAdsDetail(@Path("id")int id);
}
