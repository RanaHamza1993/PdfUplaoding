package com.example.ranahamza.myCompany;

import android.app.Application;

import net.gotev.uploadservice.UploadService;

public class Initializer extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UploadService.NAMESPACE = BuildConfig.APPLICATION_ID;

    }
}
