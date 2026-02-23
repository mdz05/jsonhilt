package com.alilopez.kt_demohilt.core.di


import com.alilopez.kt_demohilt.core.ui.network.ExerciseRetrofit
import com.alilopez.kt_demohilt.core.ui.network.JsonPlaceHolderRetrofit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    @JsonPlaceHolderRetrofit
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    @ExerciseRetrofit
    fun provideExerciseRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://exercisedb-api.vercel.app/api/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}