package com.example.tolymolyapp.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SellerInfoVO {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("facebookId")
        @Expose
        private String facebookId;
        @SerializedName("facebookAccountKitPhone")
        @Expose
        private String facebookAccountKitPhone;
        @SerializedName("hasPhone")
        @Expose
        private Boolean hasPhone;
}
