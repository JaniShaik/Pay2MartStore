package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TodayOrderResponse implements Parcelable {

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
    private ArrayList<TodayOrderDetails> todayOrderDetailsArrayList = new ArrayList<>();

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getRemainingPrice() {
        return remainingPrice;
    }

    public void setRemainingPrice(String remainingPrice) {
        this.remainingPrice = remainingPrice;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getDeliveryBoyName() {
        return deliveryBoyName;
    }

    public void setDeliveryBoyName(String deliveryBoyName) {
        this.deliveryBoyName = deliveryBoyName;
    }

    public String getDeliveryBoyPhone() {
        return deliveryBoyPhone;
    }

    public void setDeliveryBoyPhone(String deliveryBoyPhone) {
        this.deliveryBoyPhone = deliveryBoyPhone;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(String couponStatus) {
        this.couponStatus = couponStatus;
    }

    public ArrayList<TodayOrderDetails> getTodayOrderDetailsArrayList() {
        return todayOrderDetailsArrayList;
    }

    public void setTodayOrderDetailsArrayList(ArrayList<TodayOrderDetails> todayOrderDetailsArrayList) {
        this.todayOrderDetailsArrayList = todayOrderDetailsArrayList;
    }

    protected TodayOrderResponse(Parcel in) {
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
        todayOrderDetailsArrayList = in.createTypedArrayList(TodayOrderDetails.CREATOR);
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
        parcel.writeTypedList(todayOrderDetailsArrayList);
    }
    public static final Creator<TodayOrderResponse> CREATOR = new Creator<TodayOrderResponse>() {
        @Override
        public TodayOrderResponse createFromParcel(Parcel in) {
            return new TodayOrderResponse(in);
        }

        @Override
        public TodayOrderResponse[] newArray(int size) {
            return new TodayOrderResponse[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }


}
