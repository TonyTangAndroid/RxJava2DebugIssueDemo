package com.github.tonytangandroid.rxjava2debugdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.akaita.java.rxjava2debug.RxJava2Debug;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = (TextView) findViewById(R.id.tv_result);

        DataRepo.getStringObservable().subscribe(new Consumer<String>() {
            @Override
            public void accept(@NonNull String s) throws Exception {
                tvResult.setText(s);
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(@NonNull Throwable throwable) throws Exception {
                RxJava2Debug.getEnhancedStackTrace(throwable).printStackTrace();
                tvResult.setText(throwable.getMessage());
            }
        });
    }
}
