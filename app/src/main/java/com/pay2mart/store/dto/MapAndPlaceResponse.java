package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 *  Created by Sharief Shaik 09-Jul-21
 */

public class MapAndPlaceResponse implements Parcelable {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private ArrayList<MapAndPlaceDetails> mapAndPlaceDetailsArrayList = new ArrayList<>();

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

    public ArrayList<MapAndPlaceDetails> getMapAndPlaceDetailsArrayList() {
        return mapAndPlaceDetailsArrayList;
    }

    public void setMapAndPlaceDetailsArrayList(ArrayList<MapAndPlaceDetails> mapAndPlaceDetailsArrayList) {
        this.mapAndPlaceDetailsArrayList = mapAndPlaceDetailsArrayList;
    }

    protected MapAndPlaceResponse(Parcel in) {
        status = in.readString();
        message = in.readString();
        mapAndPlaceDetailsArrayList = in.createTypedArrayList(MapAndPlaceDetails.CREATOR);
    }

    public static final Creator<MapAndPlaceResponse> CREATOR = new Creator<MapAndPlaceResponse>() {
        @Override
        public MapAndPlaceResponse createFromParcel(Parcel in) {
            return new MapAndPlaceResponse(in);
        }

        @Override
        public MapAndPlaceResponse[] newArray(int size) {
            return new MapAndPlaceResponse[size];
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
        parcel.writeTypedList(mapAndPlaceDetailsArrayList);
    }
}
