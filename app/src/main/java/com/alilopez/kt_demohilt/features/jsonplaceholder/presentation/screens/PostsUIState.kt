package com.alilopez.kt_demohilt.features.jsonplaceholder.presentation.screens

import com.alilopez.kt_demohilt.features.jsonplaceholder.domain.entities.Posts

data class PostsUIState (
    val isLoading: Boolean = false,
    val posts: List<Posts> = emptyList(),
    val error: String? = null,
    val isRefreshing: Boolean = false
    )