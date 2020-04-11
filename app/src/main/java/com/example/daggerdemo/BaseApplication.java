package com.example.daggerdemo;

import android.app.Application;

import com.example.daggerdemo.dagger2.component.AppComponent;
import com.example.daggerdemo.dagger2.component.ListComponent;
import com.example.daggerdemo.dagger2.module.ListModule;

public class BaseApplication extends Application {
    private static BaseApplication instance;
    private AppComponent appComponent;
    private ListComponent listComponent;


    public ListComponent initAndGetListComponent(MainActivity mainActivity) {
        listComponent = appComponent.initListComponent(new ListModule(mainActivity));
        return listComponent;
    }

    public ListComponent getListComponent() {
        return listComponent;
    }

    public void destroyListComponent() {
        listComponent = null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
//        appComponent = DaggerAppComponent
//                .builder()
//                .build();
    }

    public static BaseApplication getInstance() {
        if (instance == null) {
            throw new IllegalStateException("Instance not initialized..");
        }
        return instance;
    }
}
