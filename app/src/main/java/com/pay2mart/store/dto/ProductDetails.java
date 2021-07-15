package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sharief Shaik on 09-Jul-21
 */
public class ProductDetails implements Parcelable {

    @SerializedName("varient_id")
    private String varientId;

    @SerializedName("product_id")
    private String productId;

    @SerializedName("quantity")
    private String quantity;

    @SerializedName("unit")
    private String unit;

    @SerializedName("base_mrp")
    private String baseMrp;

    @SerializedName("base_price")
    private String basePrice;

    @SerializedName("description")
    private String description;

    @SerializedName("varient_image")
    private String varientImage;

    @SerializedName("cat_id")
    private String catId;

    @SerializedName("product_name")
    private String productName;

    @SerializedName("product_image")
    private String productImage;

    public String getVarientId() {
        return varientId;
    }

    public void setVarientId(String varientId) {
        this.varientId = varientId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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

    public String getBaseMrp() {
        return baseMrp;
    }

    public void setBaseMrp(String baseMrp) {
        this.baseMrp = baseMrp;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVarientImage() {
        return varientImage;
    }

    public void setVarientImage(String varientImage) {
        this.varientImage = varientImage;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getHide() {
        return hide;
    }

    public void setHide(String hide) {
        this.hide = hide;
    }

    @SerializedName("hide")
    private String hide;


    protected ProductDetails(Parcel in) {
        varientId = in.readString();
        productId = in.readString();
        quantity = in.readString();
        unit = in.readString();
        baseMrp = in.readString();
        basePrice = in.readString();
        description = in.readString();
        varientImage = in.readString();
        catId = in.readString();
        productImage = in.readString();
        productName = in.readString();
        hide = in.readString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(varientId);
        parcel.writeString(productId);
        parcel.writeString(quantity);
        parcel.writeString(unit);
        parcel.writeString(baseMrp);
        parcel.writeString(basePrice);
        parcel.writeString(description);
        parcel.writeString(varientImage);
        parcel.writeString(catId);
        parcel.writeString(productName);
        parcel.writeString(productImage);
        parcel.writeString(hide);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ProductDetails> CREATOR = new Creator<ProductDetails>() {
        @Override
        public ProductDetails createFromParcel(Parcel in) {
            return new ProductDetails(in);
        }

        @Override
        public ProductDetails[] newArray(int size) {
            return new ProductDetails[size];
        }
    };
}
