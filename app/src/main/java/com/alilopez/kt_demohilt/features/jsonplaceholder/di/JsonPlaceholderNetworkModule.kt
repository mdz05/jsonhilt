package com.alilopez.kt_demohilt.features.jsonplaceholder.di

import com.alilopez.kt_demohilt.core.ui.network.JsonPlaceHolderAPI
import com.alilopez.kt_demohilt.core.ui.network.JsonPlaceHolderRetrofit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object JsonPlaceHolderNetworkModule {
    @Provides
    @Singleton
    fun provideJsonPlaceHolderApi(@JsonPlaceHolderRetrofit retrofit: Retrofit): JsonPlaceHolderAPI {
        return retrofit.create(JsonPlaceHolderAPI::class.java)
    }
}