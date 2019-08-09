package com.example.tolymolyapp.view.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.tolymolyapp.R;
import com.example.tolymolyapp.service.ApiService;
import com.example.tolymolyapp.service.RetrofitService;
import com.example.tolymolyapp.service.model.AdsDetailVO;
import com.example.tolymolyapp.service.model.CategoryVO;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {
    private  ApiService mApiservice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getExtras();
        int id = extras.getInt("id");

        getAdsDetail(id);
    }

    private void getAdsDetail(int id) {
        mApiservice = RetrofitService.getRetrofitInstance().create(ApiService.class);
        Call<AdsDetailVO> adsDetail = mApiservice.getAdsDetail(id);
        adsDetail.enqueue(new Callback<AdsDetailVO>() {
            @Override
            public void onResponse(Call<AdsDetailVO> call, Response<AdsDetailVO> response) {
                Log.d("Response Log" , ""+response.body());
            }

            @Override
            public void onFailure(Call<AdsDetailVO> call, Throwable t) {

            }
        });
    }
}
