package com.example.daggerdemo.dagger2.component;

import com.example.daggerdemo.MainActivity;
import com.example.daggerdemo.dagger2.custom_scope.ListScope;
import com.example.daggerdemo.dagger2.module.ListModule;

import dagger.Subcomponent;

@ListScope
@Subcomponent(modules = ListModule.class)
public interface ListComponent {
    void inject(MainActivity activity);
}
