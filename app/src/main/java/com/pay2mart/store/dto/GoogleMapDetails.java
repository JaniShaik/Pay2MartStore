package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sharief shaik on 09-Jul-21
 */

public class GoogleMapDetails implements Parcelable {

    @SerializedName("id")
    private String id;

    @SerializedName("map_api_key")
    private String mapApiKey;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMapApiKey() {
        return mapApiKey;
    }

    public void setMapApiKey(String mapApiKey) {
        this.mapApiKey = mapApiKey;
    }

    protected GoogleMapDetails(Parcel in) {
        id = in.readString();
        mapApiKey = in.readString();

    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(mapApiKey);
    }

    public static final Creator<GoogleMapDetails> CREATOR = new Creator<GoogleMapDetails>() {
        @Override
        public GoogleMapDetails createFromParcel(Parcel in) {
            return new GoogleMapDetails(in);
        }

        @Override
        public GoogleMapDetails[] newArray(int size) {
            return new GoogleMapDetails[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

}
