package com.orengesunshine.todowithapi.component;

import com.orengesunshine.todowithapi.ToDoApp;
import com.orengesunshine.todowithapi.modules.AppContextModule;
import com.orengesunshine.todowithapi.modules.TodoClientModule;
import com.orengesunshine.todowithapi.scope.ApplicationScope;
import com.orengesunshine.todowithapi.service.TodoClient;

import dagger.Component;

@ApplicationScope
@Component(modules = {AppContextModule.class,TodoClientModule.class})
public interface AppComponent {
//    void injectApplication(ToDoApp toDoApp);

    TodoClient getTodoClient();
}

