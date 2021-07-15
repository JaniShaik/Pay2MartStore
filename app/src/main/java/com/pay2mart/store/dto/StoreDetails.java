package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jani Shaik on 08-Jul-21
 */

public class StoreDetails implements Parcelable {

    @SerializedName("store_id")
    private String storeId;

    @SerializedName("store_name")
    private String storeName;

    @SerializedName("employee_name")
    private String employeeName;

    @SerializedName("phone_number")
    private String phoneNumber;

    @SerializedName("city")
    private String city;

    @SerializedName("admin_share")
    private String adminShare;

    @SerializedName("device_id")
    private String deviceId;

    @SerializedName("email")
    private String email;

    @SerializedName("password")
    private String password;

    @SerializedName("del_range")
    private String delRange;

    @SerializedName("lat")
    private String lat;

    @SerializedName("lng")
    private String lng;

    @SerializedName("address")
    private String address;

    @SerializedName("admin_approval")
    private String adminApproval;

    @SerializedName("pincodes")
    private String pincodes;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdminShare() {
        return adminShare;
    }

    public void setAdminShare(String adminShare) {
        this.adminShare = adminShare;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDelRange() {
        return delRange;
    }

    public void setDelRange(String delRange) {
        this.delRange = delRange;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdminApproval() {
        return adminApproval;
    }

    public void setAdminApproval(String adminApproval) {
        this.adminApproval = adminApproval;
    }

    public String getPincodes() {
        return pincodes;
    }

    public void setPincodes(String pincodes) {
        this.pincodes = pincodes;
    }

    protected StoreDetails(Parcel in) {
        storeId = in.readString();
        storeName = in.readString();
        employeeName = in.readString();
        phoneNumber = in.readString();
        city = in.readString();
        adminShare = in.readString();
        deviceId = in.readString();
        email = in.readString();
        password = in.readString();
        delRange = in.readString();
        lat = in.readString();
        lng = in.readString();
        address = in.readString();
        adminApproval = in.readString();
        pincodes = in.readString();
    }

    public static final Creator<StoreDetails> CREATOR = new Creator<StoreDetails>() {
        @Override
        public StoreDetails createFromParcel(Parcel in) {
            return new StoreDetails(in);
        }

        @Override
        public StoreDetails[] newArray(int size) {
            return new StoreDetails[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(storeId);
        parcel.writeString(storeName);
        parcel.writeString(employeeName);
        parcel.writeString(phoneNumber);
        parcel.writeString(city);
        parcel.writeString(adminShare);
        parcel.writeString(deviceId);
        parcel.writeString(email);
        parcel.writeString(password);
        parcel.writeString(delRange);
        parcel.writeString(lat);
        parcel.writeString(lng);
        parcel.writeString(address);
        parcel.writeString(adminApproval);
        parcel.writeString(pincodes);
    }
}
