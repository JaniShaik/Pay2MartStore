package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sharief Shaik on 09-Jul-21
 */

public class CityDetails implements Parcelable {

    @SerializedName("city_id")
    private String cityId;

    @SerializedName("city_name")
    private String cityName;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    protected CityDetails(Parcel in) {
        cityId = in.readString();
        cityName = in.readString();
    }

    public static final Creator<CityDetails> CREATOR = new Creator<CityDetails>() {
        @Override
        public CityDetails createFromParcel(Parcel in) {
            return new CityDetails(in);
        }

        @Override
        public CityDetails[] newArray(int size) {
            return new CityDetails[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(cityId);
        parcel.writeString(cityName);
    }
}
