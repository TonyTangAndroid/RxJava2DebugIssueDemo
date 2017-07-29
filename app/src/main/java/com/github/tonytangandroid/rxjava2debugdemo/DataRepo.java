package com.github.tonytangandroid.rxjava2debugdemo;

import android.support.annotation.Nullable;

import java.util.concurrent.Callable;

import io.reactivex.Observable;

public class DataRepo {



    public static Observable<String> getStringObservable() {
        return Observable.fromCallable(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return getDataFromNullRepo();
            }
        });
    }

    @Nullable
    private static String getDataFromNullRepo() {
        return NullRepo.getData();
    }

}
