package com.vasugajjar.imagesearchapp.api

import com.vasugajjar.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)