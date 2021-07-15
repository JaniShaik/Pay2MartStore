package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Sharief Shaik on 09-Jul-21
 */

public class CurrencyResponse implements Parcelable {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private ArrayList<CurrencyDetails> currencyDetailsArrayList = new ArrayList<>();

    protected CurrencyResponse(Parcel in) {
        status = in.readString();
        message = in.readString();
        currencyDetailsArrayList = in.createTypedArrayList(CurrencyDetails.CREATOR);
    }

    public static final Creator<CurrencyResponse> CREATOR = new Creator<CurrencyResponse>() {
        @Override
        public CurrencyResponse createFromParcel(Parcel in) {
            return new CurrencyResponse(in);
        }

        @Override
        public CurrencyResponse[] newArray(int size) {
            return new CurrencyResponse[size];
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
        parcel.writeTypedList(currencyDetailsArrayList);
    }
}
