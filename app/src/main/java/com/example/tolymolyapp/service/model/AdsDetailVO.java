package com.example.tolymolyapp.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AdsDetailVO {

    @SerializedName("createdDate")
    @Expose
    private String createdDate;

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("categoryId")
    @Expose
    private Integer categoryId;

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("priceType")
    @Expose
    private Integer priceType;
    @SerializedName("conditionId")
    @Expose
    private Integer conditionId;
    @SerializedName("regionId")
    @Expose
    private Integer regionId;
    @SerializedName("townshipId")
    @Expose
    private Integer townshipId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("adStatus")
    @Expose
    private Integer adStatus;
    @SerializedName("ownerId")
    @Expose
    private Integer ownerId;
    @SerializedName("category")
    @Expose
    private List<CategoryDetailVO> categoryList ;
    @SerializedName("image")
    @Expose
    private List<ImageDetailVO> imageList;
    @SerializedName("adId")
    @Expose
    private Integer adId;
    @SerializedName("sellerInfo")
    @Expose
    private SellerInfoVO sellerInfo;
    @SerializedName("womanTopSizeId")
    @Expose
    private Integer womanTopSizeId;
    @SerializedName("womanBottomSizeId")
    @Expose
    private Integer womanBottomSizeId;
    @SerializedName("womanShoeSizeId")
    @Expose
    private Integer womanShoeSizeId;
    @SerializedName("manTopSizeId")
    @Expose
    private Integer manTopSizeId;
    @SerializedName("manBottomSizeId")
    @Expose
    private Integer manBottomSizeId;
    @SerializedName("manShoeSizeId")
    @Expose
    private Integer manShoeSizeId;
    @SerializedName("tvTypeId")
    @Expose
    private Integer tvTypeId;
    @SerializedName("mobileBrandId")
    @Expose
    private Integer mobileBrandId;
    @SerializedName("mobileModelId")
    @Expose
    private Integer mobileModelId;
    @SerializedName("mobileStorageId")
    @Expose
    private Integer mobileStorageId;
    @SerializedName("tabletTypeId")
    @Expose
    private Integer tabletTypeId;
    @SerializedName("computerBrandId")
    @Expose
    private Integer computerBrandId;
    @SerializedName("computerModelId")
    @Expose
    private Integer computerModelId;
    @SerializedName("cpu")
    @Expose
    private String cpu;
    @SerializedName("ram")
    @Expose
    private String ram;
    @SerializedName("ssdStorage")
    @Expose
    private String ssdStorage;
    @SerializedName("hhdStorage")
    @Expose
    private String hhdStorage;
    @SerializedName("graphicCard")
    @Expose
    private String graphicCard;
    @SerializedName("display")
    @Expose
    private String display;
    @SerializedName("dvdDrive")
    @Expose
    private String dvdDrive;
    @SerializedName("battery")
    @Expose
    private String battery;
    @SerializedName("carBrandId")
    @Expose
    private Integer carBrandId;
    @SerializedName("carTypeId")
    @Expose
    private Integer carTypeId;
    @SerializedName("carModel")
    @Expose
    private String carModel;
    @SerializedName("carTransmissionId")
    @Expose
    private Integer carTransmissionId;
    @SerializedName("carMileageId")
    @Expose
    private Integer carMileageId;
    @SerializedName("carYear")
    @Expose
    private String carYear;
    @SerializedName("carDriveId")
    @Expose
    private Integer carDriveId;
    @SerializedName("carFuelId")
    @Expose
    private Integer carFuelId;
    @SerializedName("carLicenceId")
    @Expose
    private Integer carLicenceId;
    @SerializedName("carColourId")
    @Expose
    private Integer carColourId;
    @SerializedName("carLicenceTypeId")
    @Expose
    private Integer carLicenceTypeId;
    @SerializedName("carRegionalCodeId")
    @Expose
    private Integer carRegionalCodeId;
    @SerializedName("motorBikeBrandId")
    @Expose
    private Integer motorBikeBrandId;
    @SerializedName("motorBikeTypeId")
    @Expose
    private Integer motorBikeTypeId;
    @SerializedName("skinBathBodyTypeId")
    @Expose
    private Integer skinBathBodyTypeId;
    @SerializedName("hairCareTypeId")
    @Expose
    private Integer hairCareTypeId;
    @SerializedName("makeUpTypeId")
    @Expose
    private Integer makeUpTypeId;
    @SerializedName("nailCareTypeId")
    @Expose
    private Integer nailCareTypeId;
    @SerializedName("mensGroomingTypeId")
    @Expose
    private Integer mensGroomingTypeId;
    @SerializedName("pramTypeId")
    @Expose
    private Integer pramTypeId;
    @SerializedName("pramFeatureId")
    @Expose
    private Integer pramFeatureId;
    @SerializedName("girlApparelTypeId")
    @Expose
    private Integer girlApparelTypeId;
    @SerializedName("kidApparelSizeId")
    @Expose
    private Integer kidApparelSizeId;
    @SerializedName("boyApparelTypeId")
    @Expose
    private Integer boyApparelTypeId;
    @SerializedName("babyApparelTypeId")
    @Expose
    private Integer babyApparelTypeId;
    @SerializedName("babyApparelSizeId")
    @Expose
    private Integer babyApparelSizeId;
    @SerializedName("maternityTopSizeId")
    @Expose
    private Integer maternityTopSizeId;
    @SerializedName("maternityBottomSizeId")
    @Expose
    private Integer maternityBottomSizeId;
    @SerializedName("cleaningTypeId")
    @Expose
    private Integer cleaningTypeId;
    @SerializedName("airconServicesTypeId")
    @Expose
    private Integer airconServicesTypeId;
    @SerializedName("homeRepairsTypeId")
    @Expose
    private Integer homeRepairsTypeId;
    @SerializedName("electricalLightingWiringTypeId")
    @Expose
    private Integer electricalLightingWiringTypeId;
    @SerializedName("renovationsTypeId")
    @Expose
    private Integer renovationsTypeId;
    @SerializedName("electronicsGadgetRepairsTypeId")
    @Expose
    private Integer electronicsGadgetRepairsTypeId;
    @SerializedName("beautyServicesTypeId")
    @Expose
    private Integer beautyServicesTypeId;
    @SerializedName("jobTypeId")
    @Expose
    private Integer jobTypeId;
    @SerializedName("experienceLevelId")
    @Expose
    private Integer experienceLevelId;
    @SerializedName("workingHoursId")
    @Expose
    private Integer workingHoursId;
    @SerializedName("paymentRateId")
    @Expose
    private Integer paymentRateId;
    @SerializedName("salary")
    @Expose
    private String salary;
    @SerializedName("engineCapacity")
    @Expose
    private String engineCapacity;
    @SerializedName("propertyTypeId")
    @Expose
    private Integer propertyTypeId;
    @SerializedName("propertySubTypeId")
    @Expose
    private Integer propertySubTypeId;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("totalFloor")
    @Expose
    private Integer totalFloor;
    @SerializedName("floorNumberId")
    @Expose
    private Integer floorNumberId;
    @SerializedName("masterBedroom")
    @Expose
    private Integer masterBedroom;
    @SerializedName("bedroom")
    @Expose
    private Integer bedroom;
    @SerializedName("bathroom")
    @Expose
    private Integer bathroom;
    @SerializedName("floorSize")
    @Expose
    private String floorSize;
    @SerializedName("floorLength")
    @Expose
    private String floorLength;
    @SerializedName("floorWidth")
    @Expose
    private String floorWidth;
    @SerializedName("landSize")
    @Expose
    private String landSize;
    @SerializedName("landLength")
    @Expose
    private String landLength;
    @SerializedName("landWidth")
    @Expose
    private String landWidth;
    @SerializedName("owner")
    @Expose
    private Boolean owner;
    @SerializedName("favourite")
    @Expose
    private Boolean favourite;
}
