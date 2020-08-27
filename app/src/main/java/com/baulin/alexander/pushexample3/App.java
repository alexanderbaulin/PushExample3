package com.baulin.alexander.pushexample3;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;


public class App extends Application {

    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static Context getContext() {
        return instance.getApplicationContext();
    }

}
