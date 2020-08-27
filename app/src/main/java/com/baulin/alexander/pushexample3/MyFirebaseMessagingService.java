package com.baulin.alexander.pushexample3;


import android.util.Log;

import androidx.annotation.NonNull;


import com.google.firebase.messaging.FirebaseMessagingService;


public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onNewToken(@NonNull String s) {

        Log.d("myLogs", "new token = " + s);

        super.onNewToken(s);
    }
}
