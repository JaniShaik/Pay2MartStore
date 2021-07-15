package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Sharief Shaik on 09-Jul-21
 */

public class StoreProductResponse implements Parcelable {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private ArrayList<ProductDetails> listStoreDetails = new ArrayList<>();

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

    public ArrayList<ProductDetails> getListStoreDetails() {
        return listStoreDetails;
    }

    public void setListStoreDetails(ArrayList<ProductDetails> listStoreDetails) {
        this.listStoreDetails = listStoreDetails;
    }

    protected StoreProductResponse(Parcel in) {
        status = in.readString();
        message = in.readString();
        listStoreDetails = in.createTypedArrayList(ProductDetails.CREATOR);
    }

    public static final Creator<StoreProductResponse> CREATOR = new Creator<StoreProductResponse>() {
        @Override
        public StoreProductResponse createFromParcel(Parcel in) {
            return new StoreProductResponse(in);
        }

        @Override
        public StoreProductResponse[] newArray(int size) {
            return new StoreProductResponse[size];
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
        parcel.writeTypedList(listStoreDetails);

    }
}
