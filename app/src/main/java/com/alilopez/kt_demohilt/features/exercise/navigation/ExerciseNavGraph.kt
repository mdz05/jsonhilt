package com.alilopez.kt_demohilt.features.exercise.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.alilopez.kt_demohilt.core.navigation.JsonPlaceholder
import com.alilopez.kt_demohilt.core.navigation.NavigationNavGraph
import com.alilopez.kt_demohilt.features.exercise.presentation.screens.ExercisesScreen


class ExerciseNavGraph(): NavigationNavGraph{
    override fun registerNavGraph(navGraphBuilder: NavGraphBuilder, navController: NavController) {
        navGraphBuilder.composable<JsonPlaceholder> {
            ExercisesScreen(
                onNavigateToJsonPlaceHolderAPI = {
                    navController.navigate(JsonPlaceholder)
                }
            )
        }
    }
}