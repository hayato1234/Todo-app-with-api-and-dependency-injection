package com.orengesunshine.todowithapi;

import android.app.Activity;
import android.app.Application;

import com.orengesunshine.todowithapi.component.AppComponent;
import com.orengesunshine.todowithapi.component.DaggerAppComponent;
import com.orengesunshine.todowithapi.modules.AppContextModule;
import com.orengesunshine.todowithapi.service.TodoClient;

import javax.inject.Inject;

public class ToDoApp extends Application {

    AppComponent component;

    @Inject
    TodoClient todoClient;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder()
//                .appContextModule(new AppContextModule(this))
                .build();
        todoClient = component.getTodoClient();
//        component.getTodoClient();
//        component.injectApplication(this);
    }

//    public AppComponent getComponent(){
//        return component;
//    }

    public static ToDoApp getTodoApp(Activity activity){
        return (ToDoApp)activity.getApplication();
    }

//    public TodoClient getTodoClient(){
//        return todoClient;
//    }
}
