package com.pay2mart.store.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class StoreProductDetails implements Parcelable {

    @SerializedName("p_id")
    private String pId;

    @SerializedName("varient_id")
    private String varientId;

    @SerializedName("stock")
    private String stock;

    @SerializedName("store_id")
    private String storeId;

    @SerializedName("mrp")
    private String mrp;

    @SerializedName("price")
    private String price;

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

    @SerializedName("hide")
    private String hide;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getVarientId() {
        return varientId;
    }

    public void setVarientId(String varientId) {
        this.varientId = varientId;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getMrp() {
        return mrp;
    }

    public void setMrp(String mrp) {
        this.mrp = mrp;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    protected StoreProductDetails(Parcel in) {
        pId = in.readString();
        varientId = in.readString();
        stock = in.readString();
        storeId = in.readString();
        mrp = in.readString();
        price = in.readString();
        productId = in.readString();
        quantity = in.readString();
        unit = in.readString();
        baseMrp = in.readString();
        basePrice = in.readString();
        description = in.readString();
        varientImage = in.readString();
        catId = in.readString();
        productName = in.readString();
        productImage = in.readString();
        hide = in.readString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(pId);
        parcel.writeString(varientId);
        parcel.writeString(stock);
        parcel.writeString(storeId);
        parcel.writeString(mrp);
        parcel.writeString(price);
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

    public static final Creator<StoreProductDetails> CREATOR = new Creator<StoreProductDetails>() {
        @Override
        public StoreProductDetails createFromParcel(Parcel in) {
            return new StoreProductDetails(in);
        }

        @Override
        public StoreProductDetails[] newArray(int size) {
            return new StoreProductDetails[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

}
