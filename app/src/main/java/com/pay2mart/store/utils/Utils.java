package com.pay2mart.store.utils;

import android.content.Context;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jani Shaik on 08-July-21
 */

public class Utils {

    private static Pattern pattern;
    private static Matcher matcher;
    private static final String PHONE_NUMBER_PATTERN = "\\d{10}";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";

    /**
     * PHONE VALIDATION
     */
    public static boolean phoneValidate(String phoneNumber) {
        pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    /**
     * EMAIL VALIDATION
     */
    public static boolean emailValidate(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * CHECK STRING IS EMPTY OR NULL
     **/
    public static String checkString(String value) {
        String str;
        if (value == null || value.equals("") || value.equals("null")
                || value.trim().length() == 0) {
            str = "";
        } else
            str = value;
        return str;
    }

    /**
     * CHECK STRING IS EMPTY OR NULL
     **/
    public static Boolean isStringNotNullEmpty(String value) {
        if (value == null || value.equals("") || value.equals("null")
                || value.trim().length() == 0) {
            return false;
        }
        return true;
    }

    /**
     * DISPLAY TOAST MESSAGE
     */
    public static void toast(String msg, Context ctx) {
        Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * GET STRING
     */
    public static String getString(Context mContext, int id) {
        return mContext.getResources().getString(id);
    }

}
