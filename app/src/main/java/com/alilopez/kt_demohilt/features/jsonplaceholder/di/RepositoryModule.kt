package com.alilopez.kt_demohilt.features.jsonplaceholder.di



import com.alilopez.kt_demohilt.features.jsonplaceholder.data.repositories.PostsRepositoryImpl
import com.alilopez.kt_demohilt.features.jsonplaceholder.domain.repositories.PostsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindJsonPlaceHolderRepository(
        jsonPlaceHolderRepositoryImpl: PostsRepositoryImpl
    ): PostsRepository
}