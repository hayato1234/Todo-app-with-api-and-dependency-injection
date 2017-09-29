package com.orengesunshine.todowithapi.component;

import android.app.Activity;

import com.orengesunshine.todowithapi.CreateActivity;
import com.orengesunshine.todowithapi.LoginActivity;
import com.orengesunshine.todowithapi.RegisterActivity;
import com.orengesunshine.todowithapi.TaskListActivity;
import com.orengesunshine.todowithapi.modules.TaskActivityModule;
import com.orengesunshine.todowithapi.scope.ActivityScope;
import com.orengesunshine.todowithapi.service.TodoClient;

import dagger.Component;

@ActivityScope
@Component(modules = {TaskActivityModule.class},dependencies = AppComponent.class)
public interface ActivityComponent {

    void injectActivity(RegisterActivity activity);
    void injectLoginActivity(LoginActivity activity);
    void injectCreateActivity(CreateActivity activity);
    void injectTaskActivity(TaskListActivity activity);

//    TodoClient getTodoClient();
}
