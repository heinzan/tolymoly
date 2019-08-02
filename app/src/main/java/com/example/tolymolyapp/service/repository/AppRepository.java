package com.example.tolymolyapp.service.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.tolymolyapp.service.ApiService;
import com.example.tolymolyapp.service.RetrofitService;
import com.example.tolymolyapp.service.model.AdsVO;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AppRepository {

    private RetrofitService mRetrofitService;
    private ApiService mApiService;

    private static AppRepository appRepository;

    public static AppRepository getInstance(){
        if(appRepository == null){
            appRepository = new AppRepository();
        }
        return appRepository;
    }

    /*public AppRepository(){
        mApiService =RetrofitService.createService(ApiService.class);
    }
*/
    public MutableLiveData<AdsVO> getAds(){

        MutableLiveData<AdsVO> adsData =new MutableLiveData<>();
        mApiService.getAds().enqueue(new Callback<List<AdsVO>>() {
            @Override
            public void onResponse(Call<List<AdsVO>> call, Response<List<AdsVO>> response) {
                Log.d("Retrofit" , ""+response.body().toString());
            }

            @Override
            public void onFailure(Call<List<AdsVO>> call, Throwable t) {

            }
        });

        return adsData;
    }
}
