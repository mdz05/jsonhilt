package com.alilopez.kt_demohilt.features.jsonplaceholder.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.alilopez.kt_demohilt.core.navigation.Exercise
import com.alilopez.kt_demohilt.core.navigation.NavigationNavGraph
import com.alilopez.kt_demohilt.features.jsonplaceholder.presentation.screens.PostsScreen

class JsonPlaceHolderNavGraph(): NavigationNavGraph {
    override fun registerNavGraph(navGraphBuilder: NavGraphBuilder, navController: NavController) {
        navGraphBuilder.composable<Exercise> {
            PostsScreen(
                onNavigateToHome = {
                    navController.navigate(Exercise)
                }
            )
        }
    }
}