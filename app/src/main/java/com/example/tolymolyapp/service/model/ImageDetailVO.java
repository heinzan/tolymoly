package com.example.tolymolyapp.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageDetailVO {



    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("adId")
    @Expose
    private Integer adId;
    @SerializedName("imageNo")
    @Expose
    private Integer imageNo;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("version")
    @Expose
    private Integer version;
}
