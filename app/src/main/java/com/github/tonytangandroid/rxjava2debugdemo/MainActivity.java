package com.github.tonytangandroid.rxjava2debugdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Action;
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
        });
    }
}
