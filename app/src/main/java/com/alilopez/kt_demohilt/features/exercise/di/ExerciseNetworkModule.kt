package com.alilopez.kt_demohilt.features.exercise.di

import com.alilopez.kt_demohilt.core.ui.network.ExerciseApi
import com.alilopez.kt_demohilt.core.ui.network.ExerciseRetrofit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ExerciseNetworkModule {
    @Provides
    @Singleton
    fun provideExerciseApi(@ExerciseRetrofit retrofit: Retrofit): ExerciseApi {
        return retrofit.create(ExerciseApi::class.java)
    }
}