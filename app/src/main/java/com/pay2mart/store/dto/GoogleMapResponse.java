package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Sharief Shaik on 09-Jul-21
 */

public class GoogleMapResponse implements Parcelable {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private ArrayList<GoogleMapDetails> googleMapDetailsArrayList = new ArrayList<>();

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

    public ArrayList<GoogleMapDetails> getGoogleMapDetailsArrayList() {
        return googleMapDetailsArrayList;
    }

    public void setGoogleMapDetailsArrayList(ArrayList<GoogleMapDetails> googleMapDetailsArrayList) {
        this.googleMapDetailsArrayList = googleMapDetailsArrayList;
    }

    protected GoogleMapResponse(Parcel in) {
        status = in.readString();
        message = in.readString();
        googleMapDetailsArrayList = in.createTypedArrayList(GoogleMapDetails.CREATOR);

    }

    public static final Creator<GoogleMapResponse> CREATOR = new Creator<GoogleMapResponse>() {
        @Override
        public GoogleMapResponse createFromParcel(Parcel in) {
            return new GoogleMapResponse(in);
        }

        @Override
        public GoogleMapResponse[] newArray(int size) {
            return new GoogleMapResponse[size];
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
        parcel.writeTypedList(googleMapDetailsArrayList);
    }
}
