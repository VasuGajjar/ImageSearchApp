package com.vasugajjar.imagesearchapp

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {

    fun getSearchResults(query: String) =
        Pager(
            config = PagingConfig(
                pageSize = 12,
                maxSize = 40,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { UnsplashPagingSource(unsplashApi, query) }
        ).liveData

}