package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class StoreProductsResponse implements Parcelable {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private ArrayList<StoreProductDetails> storeProductDetailsArrayList = new ArrayList<>();


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

    public ArrayList<StoreProductDetails> getStoreProductDetailsArrayList() {
        return storeProductDetailsArrayList;
    }

    public void setStoreProductDetailsArrayList(ArrayList<StoreProductDetails> storeProductDetailsArrayList) {
        this.storeProductDetailsArrayList = storeProductDetailsArrayList;
    }

    protected StoreProductsResponse(Parcel in) {
        status = in.readString();
        message = in.readString();
        storeProductDetailsArrayList = in.createTypedArrayList(StoreProductDetails.CREATOR);
    }

    public static final Creator<StoreProductsResponse> CREATOR = new Creator<StoreProductsResponse>() {
        @Override
        public StoreProductsResponse createFromParcel(Parcel in) {
            return new StoreProductsResponse(in);
        }

        @Override
        public StoreProductsResponse[] newArray(int size) {
            return new StoreProductsResponse[size];
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
        parcel.writeTypedList(storeProductDetailsArrayList);
    }
}
