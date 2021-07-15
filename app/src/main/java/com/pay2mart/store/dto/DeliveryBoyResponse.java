package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Sharief Shaik on 09-Jul-21
 */

public class DeliveryBoyResponse implements Parcelable {


    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private ArrayList<DeliveryBoyDetails> deliveryBoyDetails = new ArrayList<>();

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

    public ArrayList<DeliveryBoyDetails> getDeliveryBoyDetails() {
        return deliveryBoyDetails;
    }

    public void setDeliveryBoyDetails(ArrayList<DeliveryBoyDetails> deliveryBoyDetails) {
        this.deliveryBoyDetails = deliveryBoyDetails;
    }

    protected DeliveryBoyResponse(Parcel in) {
        status = in.readString();
        message = in.readString();
        deliveryBoyDetails = in.createTypedArrayList(DeliveryBoyDetails.CREATOR);
    }

    public static final Creator<DeliveryBoyResponse> CREATOR = new Creator<DeliveryBoyResponse>() {
        @Override
        public DeliveryBoyResponse createFromParcel(Parcel in) {
            return new DeliveryBoyResponse(in);
        }

        @Override
        public DeliveryBoyResponse[] newArray(int size) {
            return new DeliveryBoyResponse[size];
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
        parcel.writeTypedList(deliveryBoyDetails);

    }
}
