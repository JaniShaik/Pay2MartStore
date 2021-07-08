package com.pay2mart.store.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

/**
 * Created by Jani Shaik on 08-July-21
 */

public class SharedPref {

    private static SharedPreferences mSharedPref;

    public static void init(Context context) {
        if (mSharedPref == null)
            mSharedPref = context.getSharedPreferences(Pay2MartConstants.PREF_NAME, Activity.MODE_PRIVATE);
    }

    public static void write(String key, boolean value) {
        SharedPreferences.Editor prefsEditor;
        if (mSharedPref != null) {
            prefsEditor = mSharedPref.edit();
            prefsEditor.putBoolean(key, value);
            prefsEditor.apply();
        }
    }

    public static void write(String key, Object obj) {
        if (mSharedPref != null && key != null) {
            SharedPreferences.Editor prefsEditor;
            try {
                String jsonVal = new Gson().toJson(obj);
                prefsEditor = mSharedPref.edit();
                prefsEditor.putString(key, jsonVal);
                prefsEditor.apply();
            } catch (JsonIOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static <T> T read(String key, Class<T> parseClass) {
        if (mSharedPref != null && key != null) {
            SharedPreferences.Editor prefsEditor;
            try {
                String valueJson = mSharedPref.getString(key, null);
                return new Gson().fromJson(valueJson, parseClass);
            } catch (JsonIOException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    public static boolean read(String key, boolean defValue) {
        if (mSharedPref != null)
            return mSharedPref.getBoolean(key, defValue);
        else
            return defValue;
    }

    public static void remove(String key) {
        if (mSharedPref != null){
            SharedPreferences.Editor prefsEditor = mSharedPref.edit();
            prefsEditor.remove(key);
            prefsEditor.apply();
        }
    }

    public static String read(String key, String defValue) {
        if (mSharedPref != null)
            return mSharedPref.getString(key, defValue);
        else
            return defValue;
    }

    public static long read(String key, long defValue) {
        if (mSharedPref != null)
            return mSharedPref.getLong(key, defValue);
        else
            return defValue;
    }

    public static void clear(String key) {
        if (mSharedPref.contains(key)) {
            SharedPreferences.Editor editor = mSharedPref.edit();
            editor.remove(key);
            editor.apply();
        }
    }

    public static void logoutUser(Context context) {
        SharedPreferences settings = mSharedPref;
        settings.edit().clear().apply();
    }

    public static void clearData() {
        SharedPreferences settings = mSharedPref;
        settings.edit().clear().apply();
    }

}
