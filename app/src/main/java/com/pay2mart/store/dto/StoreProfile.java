package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sharief Shaik on 09-Jul-21
 */

public class StoreProfile implements Parcelable {


    @SerializedName("store_name")
    private String storeName;

    @SerializedName("phone_number")
    private String phoneNumber;

    @SerializedName("email")
    private String email;

    @SerializedName("address")
    private String address;

    @SerializedName("paid")
    private String paid;

    @SerializedName("store_earning")
    private String storeEarning;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getStoreEarning() {
        return storeEarning;
    }

    public void setStoreEarning(String storeEarning) {
        this.storeEarning = storeEarning;
    }

    protected StoreProfile(Parcel in) {

        storeName = in.readString();
        phoneNumber = in.readString();
        email = in.readString();
        address = in.readString();
        paid = in.readString();
        storeEarning = in.readString();

    }

    public static final Creator<StoreProfile> CREATOR = new Creator<StoreProfile>() {
        @Override
        public StoreProfile createFromParcel(Parcel in) {
            return new StoreProfile(in);
        }

        @Override
        public StoreProfile[] newArray(int size) {
            return new StoreProfile[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(storeName);
        parcel.writeString(phoneNumber);
        parcel.writeString(email);
        parcel.writeString(address);
        parcel.writeString(paid);
        parcel.writeString(storeEarning);

    }
}
