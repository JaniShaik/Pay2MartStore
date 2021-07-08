package com.pay2mart.store.retrofit;

import android.content.Context;

import com.pay2mart.store.networkInterceptor.ConnectivityInterceptor;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Jani Shaik on 08-Jul-21
 */

public class ApiClient {

    private static Retrofit retrofit;

    public static ApiInterface getApiClient(Context mContext, String url) {
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        clientBuilder.addInterceptor(new ConnectivityInterceptor(mContext));

        OkHttpClient client = clientBuilder.build();
        retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(url)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ApiInterface.class);
    }

}
