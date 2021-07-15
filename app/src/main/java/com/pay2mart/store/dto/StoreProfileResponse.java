package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Sharief Shaik on 09-Jul-21
 */

public class StoreProfileResponse implements Parcelable {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private ArrayList<StoreProfile> storeProfileArrayList = new ArrayList<>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<StoreProfile> getStoreProfileArrayList() {
        return storeProfileArrayList;
    }

    public void setStoreProfileArrayList(ArrayList<StoreProfile> storeProfileArrayList) {
        this.storeProfileArrayList = storeProfileArrayList;
    }

    protected StoreProfileResponse(Parcel in) {
        status = in.readString();
        message = in.readString();
        storeProfileArrayList = in.createTypedArrayList(StoreProfile.CREATOR);
    }

    public static final Creator<StoreProfileResponse> CREATOR = new Creator<StoreProfileResponse>() {
        @Override
        public StoreProfileResponse createFromParcel(Parcel in) {
            return new StoreProfileResponse(in);
        }

        @Override
        public StoreProfileResponse[] newArray(int size) {
            return new StoreProfileResponse[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(status);
        parcel.writeString(message);
        parcel.writeTypedList(storeProfileArrayList);
    }
}
