package com.example.lwl.myproject;

import android.app.Application;
import android.content.Context;

/**
 * Created by LWL on 2017/3/8.
 */

public class MyApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }
    public static Context getAppliction(){
        return context;
    }
}
