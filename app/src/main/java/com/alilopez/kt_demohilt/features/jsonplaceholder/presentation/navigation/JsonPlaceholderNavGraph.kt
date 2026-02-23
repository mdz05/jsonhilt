package com.alilopez.kt_demohilt.features.jsonplaceholder.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.alilopez.kt_demohilt.core.navigation.JsonPlaceholder
import com.alilopez.kt_demohilt.core.navigation.NavigationNavGraph
import com.alilopez.kt_demohilt.features.jsonplaceholder.presentation.screens.PostsScreen
import javax.inject.Inject

class JsonPlaceholderNavGraph @Inject constructor() : NavigationNavGraph {
    override fun registerNavGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController
    ) {
        navGraphBuilder.composable<JsonPlaceholder> {
            PostsScreen(
                onNavigateToHome = {
                    navController.popBackStack()
                }
            )
        }
    }
}

