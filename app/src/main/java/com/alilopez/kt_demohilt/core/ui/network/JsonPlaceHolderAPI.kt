package com.alilopez.kt_demohilt.core.ui.network

import com.alilopez.kt_demohilt.features.jsonplaceholder.data.datasources.remote.models.PostsDto
import retrofit2.http.GET

interface JsonPlaceHolderAPI {
    @GET("posts")
    suspend fun getPosts(): List<PostsDto>
}