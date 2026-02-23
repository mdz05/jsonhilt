package com.alilopez.kt_demohilt.core.di

import com.alilopez.kt_demohilt.core.navigation.NavigationNavGraph
import com.alilopez.kt_demohilt.features.exercise.presentation.navigation.ExerciseNavGraph
import com.alilopez.kt_demohilt.features.jsonplaceholder.presentation.navigation.JsonPlaceholderNavGraph
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NavigationModule {

    @Provides
    @Singleton
    fun provideNavigationGraphs(
        exerciseNavGraph: ExerciseNavGraph,
        jsonPlaceholderNavGraph: JsonPlaceholderNavGraph
    ): List<NavigationNavGraph> {
        return listOf(
            exerciseNavGraph,
            jsonPlaceholderNavGraph
        )
    }
}

