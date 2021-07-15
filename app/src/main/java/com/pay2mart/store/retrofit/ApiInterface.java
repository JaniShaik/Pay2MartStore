package com.pay2mart.store.retrofit;

import com.pay2mart.store.dto.CartInvoieResponse;
import com.pay2mart.store.dto.CityResponse;
import com.pay2mart.store.dto.CurrencyResponse;
import com.pay2mart.store.dto.DeliveryBoyResponse;
import com.pay2mart.store.dto.FutureOrderResponse;
import com.pay2mart.store.dto.GoogleMapResponse;
import com.pay2mart.store.dto.LoginResponse;
import com.pay2mart.store.dto.MapAndPlaceResponse;
import com.pay2mart.store.dto.MapBoxResponse;
import com.pay2mart.store.dto.NextDayOrderResponse;
import com.pay2mart.store.dto.PastOrders;
import com.pay2mart.store.dto.StoreProductResponse;
import com.pay2mart.store.dto.StoreProductsResponse;
import com.pay2mart.store.dto.StoreProfileResponse;
import com.pay2mart.store.dto.TodayOrderResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Jani Shaik on 08-Jul-21
 */

public interface ApiInterface {

    @FormUrlEncoded
    @POST("store_login")
    Call<LoginResponse> getLoginDetails(@Field("email") String email, @Field("password") String password);

    @FormUrlEncoded
    @POST("storetoday_orders")
    Call<TodayOrderResponse> getTodayOrderDetails(@Field("store_id") String store_id);

    @FormUrlEncoded
    @POST("past_orders")
    Call<PastOrders> getPastOrders(@Field("store_id") String store_id);

    @FormUrlEncoded
    @POST("storenextday_orders")
    Call<NextDayOrderResponse> getNextDayOrders(@Field("store_id") String store_id);

    @FormUrlEncoded
    @POST("future_orders")
    Call<FutureOrderResponse> getFutureOrders(@Field("store_id") String store_id);

    @FormUrlEncoded
    @POST("storeproducts")
    Call<StoreProductsResponse> getStoreProductDetails(@Field("store_id") String store_id);

    @FormUrlEncoded
    @POST("productselect")
    Call<StoreProductResponse> getStoreProducts();


    @FormUrlEncoded
    @POST("nearbydboys")
    Call<DeliveryBoyResponse> getDeliveryBoyDetails(@Field("store_id") String store_id);


    @FormUrlEncoded
    @POST("store_profile")
    Call<StoreProfileResponse> getStoreProfileDetails(@Field("store_id") String store_id);

    @FormUrlEncoded
    @POST("cart_invoice")
    Call<CartInvoieResponse> getCartInvoiceDetails(@Field("cart_id") String cart_id);

    @GET("currency")
    Call<CurrencyResponse> getCurrencyDetails();

    @GET("google_map")
    Call<GoogleMapResponse> getGoogleMapDetails();

    @GET("mapbox")
    Call<MapBoxResponse> getMapBoxDetails();

    @GET("mapby")
    Call<MapAndPlaceResponse> getMapAndPlaceDetails();

    @GET("city")
    Call<CityResponse> getCityResponse();


}
