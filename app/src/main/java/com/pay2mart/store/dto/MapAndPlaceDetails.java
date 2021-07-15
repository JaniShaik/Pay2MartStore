package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;


import com.google.gson.annotations.SerializedName;

/**
 * Created by Sharief Shaik 09-Jul-21
 */

public class MapAndPlaceDetails implements Parcelable {

    @SerializedName("map_id")
    private String mapId;

    @SerializedName("mapbox")
    private String mapBox;

    @SerializedName("google_map")
    private String googleMap;

    public String getMapId() {
        return mapId;
    }

    public void setMapId(String mapId) {
        this.mapId = mapId;
    }

    public String getMapBox() {
        return mapBox;
    }

    public void setMapBox(String mapBox) {
        this.mapBox = mapBox;
    }

    public String getGoogleMap() {
        return googleMap;
    }

    public void setGoogleMap(String googleMap) {
        this.googleMap = googleMap;
    }

    protected MapAndPlaceDetails(Parcel in) {
        mapBox = in.readString();
        mapId = in.readString();
        googleMap = in.readString();
    }

    public static final Creator<MapAndPlaceDetails> CREATOR = new Creator<MapAndPlaceDetails>() {
        @Override
        public MapAndPlaceDetails createFromParcel(Parcel in) {
            return new MapAndPlaceDetails(in);
        }

        @Override
        public MapAndPlaceDetails[] newArray(int size) {
            return new MapAndPlaceDetails[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mapId);
        parcel.writeString(mapBox);
        parcel.writeString(googleMap);
    }
}
