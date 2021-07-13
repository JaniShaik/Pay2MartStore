package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sharief Shaik on 09-Jul-21
 */

public class MapBoxDetails implements Parcelable {

    @SerializedName("map_id")
    private String mapId;

    @SerializedName("mapbox_api")
    private String mapboxApi;

    public String getMapId() {
        return mapId;
    }

    public void setMapId(String mapId) {
        this.mapId = mapId;
    }

    public String getMapboxApi() {
        return mapboxApi;
    }

    public void setMapboxApi(String mapboxApi) {
        this.mapboxApi = mapboxApi;
    }

    protected MapBoxDetails(Parcel in) {
        mapId = in.readString();
        mapboxApi = in.readString();
    }

    public static final Creator<MapBoxDetails> CREATOR = new Creator<MapBoxDetails>() {
        @Override
        public MapBoxDetails createFromParcel(Parcel in) {
            return new MapBoxDetails(in);
        }

        @Override
        public MapBoxDetails[] newArray(int size) {
            return new MapBoxDetails[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mapId);
        parcel.writeString(mapboxApi);
    }
}
