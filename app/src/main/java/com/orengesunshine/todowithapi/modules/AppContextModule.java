package com.orengesunshine.todowithapi.modules;

import android.content.Context;

import com.orengesunshine.todowithapi.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class AppContextModule {
    private final Context context;

    public AppContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    Context provideAppContext(){
        return context;
    }
}
