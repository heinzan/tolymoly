package com.example.tolymolyapp.view.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tolymolyapp.R;
import com.example.tolymolyapp.adapters.AdRecyclerAdapter;
import com.example.tolymolyapp.adapters.CategoryRecyclerAdapter;
import com.example.tolymolyapp.service.ApiService;
import com.example.tolymolyapp.service.RetrofitService;
import com.example.tolymolyapp.service.model.AdsVO;
import com.example.tolymolyapp.service.model.CategoryVO;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {
    private  ApiService mApiservice;
    private RecyclerView adRecycler , catrecycler;
    private AdRecyclerAdapter mAdRecyclerAdapter;
    private CategoryRecyclerAdapter mCategoryRecyclerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home , container , false);
        adRecycler = v.findViewById(R.id.rv_ads);
        catrecycler = v.findViewById(R.id.rv_cat);
        getCategory();
        getAdsData();
        return v;

    }

    private void getCategory() {
        mApiservice = RetrofitService.getRetrofitInstance().create(ApiService.class);
        Call<List<CategoryVO>> categoryCall = mApiservice.getCategory();
        categoryCall.enqueue(new Callback<List<CategoryVO>>() {
            @Override
            public void onResponse(Call<List<CategoryVO>> call, Response<List<CategoryVO>> response) {
                loadCategory(response.body());
            }

            @Override
            public void onFailure(Call<List<CategoryVO>> call, Throwable t) {

            }
        });

    }

    private void loadCategory(List<CategoryVO> body) {
        mCategoryRecyclerAdapter = new CategoryRecyclerAdapter(body , getContext());

        catrecycler.setLayoutManager(new GridLayoutManager(getContext(), 2));
        catrecycler.setAdapter(mCategoryRecyclerAdapter);
    }

    private void getAdsData() {
        mApiservice = RetrofitService.getRetrofitInstance().create(ApiService.class);
        Call<List<AdsVO>> call = mApiservice.getAds();
        call.enqueue(new Callback<List<AdsVO>>() {
            @Override
            public void onResponse(Call<List<AdsVO>> call, Response<List<AdsVO>> response) {
                loadData(response.body());
            }

            @Override
            public void onFailure(Call<List<AdsVO>> call, Throwable t) {
                Toast.makeText(getContext() , "Failure AD" , Toast.LENGTH_LONG).show();
            }
        });

    }

    private void loadData(List<AdsVO> body) {
        mAdRecyclerAdapter = new AdRecyclerAdapter(body , getContext());

        adRecycler.setLayoutManager(new GridLayoutManager(getContext(), 2));
        adRecycler.setAdapter(mAdRecyclerAdapter);


    }
}
