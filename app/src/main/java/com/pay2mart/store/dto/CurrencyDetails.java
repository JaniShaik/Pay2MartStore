package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sharief Shaik on 09-Jul-21
 */

public class CurrencyDetails implements Parcelable {

    @SerializedName("id")
    private String id;

    @SerializedName("currency_name")
    private String currencyName;

    @SerializedName("currency_sign")
    private String currencySign;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencySign() {
        return currencySign;
    }

    public void setCurrencySign(String currencySign) {
        this.currencySign = currencySign;
    }

    protected CurrencyDetails(Parcel in) {
        id = in.readString();
        currencyName = in.readString();
        currencySign = in.readString();
    }

    public static final Creator<CurrencyDetails> CREATOR = new Creator<CurrencyDetails>() {
        @Override
        public CurrencyDetails createFromParcel(Parcel in) {
            return new CurrencyDetails(in);
        }

        @Override
        public CurrencyDetails[] newArray(int size) {
            return new CurrencyDetails[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(currencyName);
        parcel.writeString(currencySign);
    }
}
