package com.alilopez.kt_demohilt.features.exercise.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.alilopez.kt_demohilt.core.navigation.Exercise
import com.alilopez.kt_demohilt.core.navigation.JsonPlaceholder
import com.alilopez.kt_demohilt.core.navigation.NavigationNavGraph
import com.alilopez.kt_demohilt.features.exercise.presentation.screens.ExercisesScreen
import javax.inject.Inject

class ExerciseNavGraph @Inject constructor() : NavigationNavGraph {
    override fun registerNavGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController
    ) {
        navGraphBuilder.composable<Exercise> {
            ExercisesScreen(
                onNavigateToJsonPlaceHolderAPI = {
                    navController.navigate(JsonPlaceholder)
                }
            )
        }
    }
}

