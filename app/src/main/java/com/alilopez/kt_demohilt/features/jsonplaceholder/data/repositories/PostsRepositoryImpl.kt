package com.alilopez.kt_demohilt.features.jsonplaceholder.data.repositories

import android.util.Log
import com.alilopez.kt_demohilt.features.jsonplaceholder.data.datasources.remote.mapper.toDomain
import com.alilopez.kt_demohilt.features.jsonplaceholder.domain.entities.Posts
import com.alilopez.kt_demohilt.core.ui.network.JsonPlaceHolderAPI
import com.alilopez.kt_demohilt.features.jsonplaceholder.domain.repositories.PostsRepository
import javax.inject.Inject


class PostsRepositoryImpl @Inject constructor(
    private val api: JsonPlaceHolderAPI
) : PostsRepository {

    override suspend fun getPosts(): List<Posts> {
        val response = api.getPosts()
        Log.d("JsonPlaceHolder",response.toString())
        return response.map { it.toDomain() }
    }
}