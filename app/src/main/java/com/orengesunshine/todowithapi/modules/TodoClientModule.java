package com.orengesunshine.todowithapi.modules;

import com.orengesunshine.todowithapi.scope.ApplicationScope;
import com.orengesunshine.todowithapi.service.TodoClient;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = AppContextModule.class)
public class TodoClientModule {

    @Provides
    @ApplicationScope
    public TodoClient TodoClient(Retrofit retrofit){
        return retrofit.create(TodoClient.class);
    }

    @Provides
    @ApplicationScope
    Retrofit provideRetrofit(){
        return new Retrofit.Builder()
                .baseUrl(TodoClient.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
