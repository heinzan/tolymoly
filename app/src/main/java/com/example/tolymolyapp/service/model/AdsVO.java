package com.example.tolymolyapp.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdsVO {

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("coverImage")
    @Expose
    private String coverImage;

    @SerializedName("title")
    @Expose
    private String  title;

    @SerializedName("price")
    @Expose
    private Double price;

    @SerializedName("priceType")
    @Expose
    private int price_type;

    @SerializedName("ownerId")
    @Expose
    private int owner_id;

    @SerializedName("userImage")
    @Expose
    private String user_image;

    @SerializedName("userName")
    @Expose
    private String user_name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getPrice_type() {
        return price_type;
    }

    public void setPrice_type(int price_type) {
        this.price_type = price_type;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }


}
