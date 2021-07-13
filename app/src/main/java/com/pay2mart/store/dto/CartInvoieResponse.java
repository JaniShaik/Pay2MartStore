package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Sharief Shaik on 09-Jul-21
 */

public class CartInvoieResponse implements Parcelable {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("invoice_no")
    private String invoiceNo;

    @SerializedName("number")
    private String number;

    @SerializedName("Name")
    private String Name;

    @SerializedName("address")
    private String address;

    @SerializedName("city")
    private String city;

    @SerializedName("pincode")
    private String pincode;

    @SerializedName("paid_by_wallet")
    private String paidByWallet;

    @SerializedName("coupon_discount")
    private String couponDiscount;

    @SerializedName("price_to_pay")
    private String priceToPay;

    @SerializedName("total_price")
    private String totalPrice;

    @SerializedName("price_without_delivery")
    private String priceWithoutDelivery;

    @SerializedName("delivery_charge")
    private String deliveryCharge;

    @SerializedName("order_details")
    private ArrayList<CartInvoiceDetails> cartInvoiceDetailsArrayList = new ArrayList<>();

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

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPaidByWallet() {
        return paidByWallet;
    }

    public void setPaidByWallet(String paidByWallet) {
        this.paidByWallet = paidByWallet;
    }

    public String getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(String couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public String getPriceToPay() {
        return priceToPay;
    }

    public void setPriceToPay(String priceToPay) {
        this.priceToPay = priceToPay;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPriceWithoutDelivery() {
        return priceWithoutDelivery;
    }

    public void setPriceWithoutDelivery(String priceWithoutDelivery) {
        this.priceWithoutDelivery = priceWithoutDelivery;
    }

    public String getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(String deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public ArrayList<CartInvoiceDetails> getCartInvoiceDetailsArrayList() {
        return cartInvoiceDetailsArrayList;
    }

    public void setCartInvoiceDetailsArrayList(ArrayList<CartInvoiceDetails> cartInvoiceDetailsArrayList) {
        this.cartInvoiceDetailsArrayList = cartInvoiceDetailsArrayList;
    }

    protected CartInvoieResponse(Parcel in) {
        status = in.readString();
        message = in.readString();
        invoiceNo = in.readString();
        number = in.readString();
        Name = in.readString();
        address = in.readString();
        city = in.readString();
        pincode = in.readString();
        paidByWallet = in.readString();
        couponDiscount = in.readString();
        priceToPay = in.readString();
        totalPrice = in.readString();
        priceWithoutDelivery = in.readString();
        deliveryCharge = in.readString();
        cartInvoiceDetailsArrayList = in.createTypedArrayList(CartInvoiceDetails.CREATOR);

    }

    public static final Creator<CartInvoieResponse> CREATOR = new Creator<CartInvoieResponse>() {
        @Override
        public CartInvoieResponse createFromParcel(Parcel in) {
            return new CartInvoieResponse(in);
        }

        @Override
        public CartInvoieResponse[] newArray(int size) {
            return new CartInvoieResponse[size];
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
        parcel.writeString(invoiceNo);
        parcel.writeString(number);
        parcel.writeString(Name);
        parcel.writeString(address);
        parcel.writeString(city);
        parcel.writeString(pincode);
        parcel.writeString(paidByWallet);
        parcel.writeString(couponDiscount);
        parcel.writeString(priceToPay);
        parcel.writeString(totalPrice);
        parcel.writeString(priceWithoutDelivery);
        parcel.writeString(deliveryCharge);
        parcel.writeTypedList(cartInvoiceDetailsArrayList);
    }
}
