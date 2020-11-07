package com.vasugajjar.imagesearchapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnsplashPhoto (
    val id: String,
    val description: String?,
    val user: UnsplashUser,
    val urls: UnsplashPhotoUrl
): Parcelable {

    @Parcelize
    data class UnsplashUser(
        val username: String,
        val name: String
    ): Parcelable {
        val attributionUrl get() = "https://unsplash.com/$username?utm_source=ImageSearchApp&utm_medium=referral"
    }

    @Parcelize
    data class UnsplashPhotoUrl(
        val raw: String,
        val full: String,
        val regular: String,
        val small: String,
        val thumb: String
    ): Parcelable

}