package com.example.daggerdemo.dagger2.module;


import android.content.Context;

import com.example.daggerdemo.MainActivity;
import com.example.daggerdemo.dagger2.adapter.AdapterList;
import com.example.daggerdemo.dagger2.custom_scope.ListScope;

import java.util.List;

import dagger.Module;
import dagger.Provides;

@Module
public class ListModule {

    private final MainActivity mainActivity;

    public ListModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    @ListScope
    public List<String> getMockList() {
        return mainActivity.initList();
    }

    @Provides
    @ListScope
    public AdapterList getAdapter(Context context, List<String> list) {
        return new AdapterList(context, list);
    }
}
