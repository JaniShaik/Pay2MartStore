package com.pay2mart.store.networkInterceptor;

import java.io.IOException;

/**
 * Created by Jani Shaik on 08-Jul-21
 */

public class NoConnectivityException extends IOException {
    public String getMessage() {
        return "No connectivity exception";
    }
}
