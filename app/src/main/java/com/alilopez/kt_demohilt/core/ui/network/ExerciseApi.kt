package com.alilopez.kt_demohilt.core.ui.network

import com.alilopez.kt_demohilt.features.exercise.data.datasources.remote.model.ExercisesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ExerciseApi {

    @GET("exercises")
    suspend fun getExercises(
        @Query("limit") limit: Int
    ): ExercisesResponse

    @GET("exercises/filter")
    suspend fun getExercisesByBodyPart(
        @Query("limit") limit: Int,
        @Query("bodyParts") bodyPart: String
    ): ExercisesResponse

}