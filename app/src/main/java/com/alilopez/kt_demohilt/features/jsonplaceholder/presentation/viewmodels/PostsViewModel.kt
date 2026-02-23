package com.alilopez.kt_demohilt.features.jsonplaceholder.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alilopez.kt_demohilt.features.jsonplaceholder.domain.usescases.GetPostsUseCase
import com.alilopez.kt_demohilt.features.jsonplaceholder.presentation.screens.PostsUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostsViewModel @Inject constructor(
    private val getPostsUseCase: GetPostsUseCase
): ViewModel(){
    private val _uiState = MutableStateFlow(PostsUIState())
    val uiState = _uiState.asStateFlow()

    init {
        loadPosts()
    }

    private fun loadPosts(){
        _uiState.update { it.copy(isLoading = true) }

        viewModelScope.launch {
            val result = getPostsUseCase()
            _uiState.update { currentState ->
                result.fold(
                    onSuccess = { list ->
                        currentState.copy(isLoading = false, posts = list)
                    },
                    onFailure = { error ->
                        currentState.copy(isLoading = false, error = error.message)
                    }
                )
            }
        }
    }
}