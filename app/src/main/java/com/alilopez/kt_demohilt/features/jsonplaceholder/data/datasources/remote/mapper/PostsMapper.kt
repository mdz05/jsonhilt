package com.alilopez.kt_demohilt.features.jsonplaceholder.data.datasources.remote.mapper

import com.alilopez.kt_demohilt.features.jsonplaceholder.data.datasources.remote.models.PostsDto
import com.alilopez.kt_demohilt.features.jsonplaceholder.domain.entities.Posts


fun PostsDto.toDomain(): Posts {
    return Posts(
        id = this.id,
        title = this.title,
        body = this.body
    )
}