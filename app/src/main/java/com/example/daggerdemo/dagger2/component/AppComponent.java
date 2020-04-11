package com.example.daggerdemo.dagger2.component;

import com.example.daggerdemo.dagger2.module.AppModule;
import com.example.daggerdemo.dagger2.module.ListModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    ListComponent initListComponent(ListModule listModule);
}
