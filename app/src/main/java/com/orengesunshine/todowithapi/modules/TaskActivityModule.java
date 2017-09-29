package com.orengesunshine.todowithapi.modules;

import com.orengesunshine.todowithapi.TaskListActivity;
import com.orengesunshine.todowithapi.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class TaskActivityModule {

    private final TaskListActivity activity;

    public TaskActivityModule(TaskListActivity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    public TaskListActivity provideTaskListActivity(){
        return activity;
    }
}
