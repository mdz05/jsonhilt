package com.alilopez.kt_demohilt.features.jsonplaceholder.domain.usescases

import com.alilopez.kt_demohilt.features.jsonplaceholder.domain.entities.Posts
import com.alilopez.kt_demohilt.features.jsonplaceholder.domain.repositories.PostsRepository
import javax.inject.Inject

class GetPostsUseCase @Inject constructor(
    private val repository: PostsRepository
) {
        suspend operator fun invoke(): Result<List<Posts>> {
            return try {
                val posts = repository.getPosts()

                val filteredPosts = posts.filter { it.title.isNotBlank() }

                if (filteredPosts.isEmpty()) {
                    Result.failure(Exception("No se encontraron post válidos"))
                } else {
                    Result.success(filteredPosts)
                }
            } catch (e: Exception) {
                Result.failure(e)
            }
        }
    }