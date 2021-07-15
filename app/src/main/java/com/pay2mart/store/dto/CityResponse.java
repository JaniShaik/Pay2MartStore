package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Sharief Shaik on 09-Jul-21
 */

public class CityResponse implements Parcelable {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private ArrayList<CityDetails> cityDetailsArrayList = new ArrayList<>();

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

    public ArrayList<CityDetails> getCityDetailsArrayList() {
        return cityDetailsArrayList;
    }

    public void setCityDetailsArrayList(ArrayList<CityDetails> cityDetailsArrayList) {
        this.cityDetailsArrayList = cityDetailsArrayList;
    }

    protected CityResponse(Parcel in) {
        status = in.readString();
        message = in.readString();
        cityDetailsArrayList = in.createTypedArrayList(CityDetails.CREATOR);

    }

    public static final Creator<CityResponse> CREATOR = new Creator<CityResponse>() {
        @Override
        public CityResponse createFromParcel(Parcel in) {
            return new CityResponse(in);
        }

        @Override
        public CityResponse[] newArray(int size) {
            return new CityResponse[size];
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
        parcel.writeTypedList(cityDetailsArrayList);
    }
}
