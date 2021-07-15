package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 *  Created by Sharief Shaik on 08-Jul-21
 */

public class OrderDetails implements Parcelable {

    @SerializedName("store_order_id")
    private String storeOrderId;

    @SerializedName("product_name")
    private String productName;

    @SerializedName("varient_image")
    private String varientImage;

    @SerializedName("quantity")
    private String quantity;

    @SerializedName("unit")
    private String unit;

    @SerializedName("varient_id")
    private String varientId;

    @SerializedName("qty")
    private String qty;

    @SerializedName("price")
    private String price;

    @SerializedName("total_mrp")
    private String totalMrp;

    public String getStoreOrderId() {
        return storeOrderId;
    }

    public void setStoreOrderId(String storeOrderId) {
        this.storeOrderId = storeOrderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getVarientImage() {
        return varientImage;
    }

    public void setVarientImage(String varientImage) {
        this.varientImage = varientImage;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getVarientId() {
        return varientId;
    }

    public void setVarientId(String varientId) {
        this.varientId = varientId;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotalMrp() {
        return totalMrp;
    }

    public void setTotalMrp(String totalMrp) {
        this.totalMrp = totalMrp;
    }

    public String getOrderCartId() {
        return orderCartId;
    }

    public void setOrderCartId(String orderCartId) {
        this.orderCartId = orderCartId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStoreApproval() {
        return storeApproval;
    }

    public void setStoreApproval(String storeApproval) {
        this.storeApproval = storeApproval;
    }

    @SerializedName("order_cart_id")
    private String orderCartId;

    @SerializedName("order_date")
    private String orderDate;

    @SerializedName("store_approval")
    private String storeApproval;


    protected OrderDetails(Parcel in) {
        storeOrderId = in.readString();
        productName = in.readString();
        varientImage = in.readString();
        quantity = in.readString();
        unit = in.readString();
        varientId = in.readString();
        qty = in.readString();
        price = in.readString();
        totalMrp = in.readString();
        orderCartId = in.readString();
        orderDate = in.readString();
        storeApproval = in.readString();
    }

    public static final Creator<OrderDetails> CREATOR = new Creator<OrderDetails>() {
        @Override
        public OrderDetails createFromParcel(Parcel in) {
            return new OrderDetails(in);
        }

        @Override
        public OrderDetails[] newArray(int size) {
            return new OrderDetails[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(storeOrderId);
        parcel.writeString(productName);
        parcel.writeString(varientImage);
        parcel.writeString(quantity);
        parcel.writeString(unit);
        parcel.writeString(varientId);
        parcel.writeString(qty);
        parcel.writeString(price);
        parcel.writeString(totalMrp);
        parcel.writeString(orderCartId);
        parcel.writeString(orderDate);
        parcel.writeString(storeApproval);
    }
}
