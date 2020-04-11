package com.example.daggerdemo.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.daggerdemo.BaseApplication;
import com.example.daggerdemo.R;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    List Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BaseApplication.getInstance().initAndGetListComponent(this).inject(this);
    }

    public List<String> initList() {
        return Arrays.asList("a", "b", "c");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BaseApplication.getInstance().destroyListComponent();
    }
}
