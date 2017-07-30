package com.github.tonytangandroid.rxjava2debugdemo;

import android.app.Application;

import com.akaita.java.rxjava2debug.RxJava2Debug;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RxJava2Debug.enableRxJava2AssemblyTracking();
    }
}
