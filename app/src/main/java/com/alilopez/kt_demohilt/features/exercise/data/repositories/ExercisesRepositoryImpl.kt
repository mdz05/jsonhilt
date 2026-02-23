package com.alilopez.kt_demohilt.features.exercise.data.repositories

import com.alilopez.kt_demohilt.core.ui.network.ExerciseApi
import com.alilopez.kt_demohilt.features.exercise.data.datasources.remote.mapper.toDomain
import com.alilopez.kt_demohilt.features.exercise.domain.entities.Exercise
import com.alilopez.kt_demohilt.features.exercise.domain.repositories.ExerciseRepository
import javax.inject.Inject

class ExercisesRepositoryImpl @Inject constructor(
    private val api: ExerciseApi
): ExerciseRepository {

    override suspend fun getExercises(): List<Exercise> {
        val response = api.getExercises(
            limit = 5
        )
        return response.data.map { it.toDomain() }
    }

    override suspend fun getExercisesByBodyPart(bodyPart: String): List<Exercise> {
        val response = api.getExercisesByBodyPart(
            limit = 25,
            bodyPart = bodyPart
        )
        return response.data.map { it.toDomain() }
    }
}