package com.alilopez.kt_demohilt.features.exercise.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alilopez.kt_demohilt.features.exercise.domain.usecases.GetExercisesUseCase
import com.alilopez.kt_demohilt.features.exercise.domain.usecases.GetExercisesByBodyPartUseCase

class ExerciseViewModelFactory(
    private val getExercisesUseCase: GetExercisesUseCase,
    private val getExercisesByBodyPartUseCase: GetExercisesByBodyPartUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ExerciseViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ExerciseViewModel(getExercisesUseCase, getExercisesByBodyPartUseCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
    }
}