package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Sharief Shaik 0n 09-Jul-21
 */

public class FutureOrderResponse implements Parcelable {

    @SerializedName("user_address")
    private String userAddress;

    @SerializedName("cart_id")
    private String cartId;

    @SerializedName("user_name")
    private String userName;

    @SerializedName("user_phone")
    private String userPhone;

    @SerializedName("remaining_price")
    private String remainingPrice;

    @SerializedName("order_price")
    private String orderPrice;

    @SerializedName("delivery_boy_name")
    private String deliveryBoyName;

    @SerializedName("delivery_boy_phone")
    private String deliveryBoyPhone;

    @SerializedName("delivery_date")
    private String deliveryDate;

    @SerializedName("time_slot")
    private String timeSlot;

    @SerializedName("payment_mode")
    private String paymentMode;

    @SerializedName("payment_status")
    private String paymentStatus;

    @SerializedName("order_status")
    private String orderStatus;

    @SerializedName("customer_phone")
    private String customerPhone;

    @SerializedName("coupon_code")
    private String couponCode;

    @SerializedName("coupon_status")
    private String couponStatus;

    @SerializedName("order_details")
    private ArrayList<FutureOrderDetails> orderDetailsArrayList = new ArrayList<>();

    protected FutureOrderResponse(Parcel in) {
        userAddress = in.readString();
        cartId = in.readString();
        userName = in.readString();
        userPhone = in.readString();
        remainingPrice = in.readString();
        orderPrice = in.readString();
        deliveryBoyName = in.readString();
        deliveryBoyPhone = in.readString();
        deliveryDate = in.readString();
        timeSlot = in.readString();
        paymentMode = in.readString();
        paymentStatus = in.readString();
        orderStatus = in.readString();
        customerPhone = in.readString();
        couponCode = in.readString();
        couponStatus = in.readString();
        orderDetailsArrayList = in.createTypedArrayList(FutureOrderDetails.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(userAddress);
        parcel.writeString(cartId);
        parcel.writeString(userName);
        parcel.writeString(userPhone);
        parcel.writeString(remainingPrice);
        parcel.writeString(orderPrice);
        parcel.writeString(deliveryBoyName);
        parcel.writeString(deliveryBoyPhone);
        parcel.writeString(deliveryDate);
        parcel.writeString(timeSlot);
        parcel.writeString(paymentMode);
        parcel.writeString(paymentStatus);
        parcel.writeString(orderStatus);
        parcel.writeString(customerPhone);
        parcel.writeString(couponCode);
        parcel.writeString(couponStatus);
        parcel.writeTypedList(orderDetailsArrayList);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<FutureOrderResponse> CREATOR = new Creator<FutureOrderResponse>() {
        @Override
        public FutureOrderResponse createFromParcel(Parcel in) {
            return new FutureOrderResponse(in);
        }

        @Override
        public FutureOrderResponse[] newArray(int size) {
            return new FutureOrderResponse[size];
        }
    };
}
