package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 *  Created by Sharief Shaik on 09-Jul-21
 */

public class DeliveryBoyDetails implements Parcelable {

    @SerializedName("dboy_id")
    private String dboyId;

    @SerializedName("boy_name")
    private String boyName;

    @SerializedName("boy_phone")
    private String boyPhone;

    @SerializedName("boy_city")
    private String boyCity;

    @SerializedName("d_store_id")
    private String dStoreId;

    @SerializedName("password")
    private String password;

    @SerializedName("device_id")
    private String deviceId;

    @SerializedName("boy_loc")
    private String boyLoc;

    @SerializedName("lat")
    private String lat;

    @SerializedName("lng")
    private String lng;

    @SerializedName("status")
    private String status;

    public String getDboyId() {
        return dboyId;
    }

    public void setDboyId(String dboyId) {
        this.dboyId = dboyId;
    }

    public String getBoyName() {
        return boyName;
    }

    public void setBoyName(String boyName) {
        this.boyName = boyName;
    }

    public String getBoyPhone() {
        return boyPhone;
    }

    public void setBoyPhone(String boyPhone) {
        this.boyPhone = boyPhone;
    }

    public String getBoyCity() {
        return boyCity;
    }

    public void setBoyCity(String boyCity) {
        this.boyCity = boyCity;
    }

    public String getdStoreId() {
        return dStoreId;
    }

    public void setdStoreId(String dStoreId) {
        this.dStoreId = dStoreId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getBoyLoc() {
        return boyLoc;
    }

    public void setBoyLoc(String boyLoc) {
        this.boyLoc = boyLoc;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    protected DeliveryBoyDetails(Parcel in) {
        dboyId = in.readString();
        boyName = in.readString();
        boyPhone = in.readString();
        boyCity = in.readString();
        dStoreId = in.readString();
        password = in.readString();
        deviceId = in.readString();
        boyLoc = in.readString();
        lat = in.readString();
        lng = in.readString();
        status = in.readString();
    }

    public static final Creator<DeliveryBoyDetails> CREATOR = new Creator<DeliveryBoyDetails>() {
        @Override
        public DeliveryBoyDetails createFromParcel(Parcel in) {
            return new DeliveryBoyDetails(in);
        }

        @Override
        public DeliveryBoyDetails[] newArray(int size) {
            return new DeliveryBoyDetails[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(dboyId);
        parcel.writeString(boyName);
        parcel.writeString(boyPhone);
        parcel.writeString(boyCity);
        parcel.writeString(dStoreId);
        parcel.writeString(password);
        parcel.writeString(deviceId);
        parcel.writeString(boyLoc);
        parcel.writeString(lat);
        parcel.writeString(lng);
        parcel.writeString(status);
    }
}
