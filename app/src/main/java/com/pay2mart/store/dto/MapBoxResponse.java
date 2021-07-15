package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Sharief Shaik on 09-Jul-21
 */

public class MapBoxResponse implements Parcelable {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private ArrayList<MapBoxDetails> mapBoxDetailsArrayList = new ArrayList<>();

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

    public ArrayList<MapBoxDetails> getMapBoxDetailsArrayList() {
        return mapBoxDetailsArrayList;
    }

    public void setMapBoxDetailsArrayList(ArrayList<MapBoxDetails> mapBoxDetailsArrayList) {
        this.mapBoxDetailsArrayList = mapBoxDetailsArrayList;
    }

    protected MapBoxResponse(Parcel in) {
        status = in.readString();
        message = in.readString();
        mapBoxDetailsArrayList = in.createTypedArrayList(MapBoxDetails.CREATOR);

    }

    public static final Creator<MapBoxResponse> CREATOR = new Creator<MapBoxResponse>() {
        @Override
        public MapBoxResponse createFromParcel(Parcel in) {
            return new MapBoxResponse(in);
        }

        @Override
        public MapBoxResponse[] newArray(int size) {
            return new MapBoxResponse[size];
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
        parcel.writeTypedList(mapBoxDetailsArrayList);
    }
}
