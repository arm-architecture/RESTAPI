package com.example.api_rest.helper

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
class PhotoAPI
{
    companion object
    {
        private val url: String ="https://android-kotlin-fun-mars-server.appspot.com"

        private val retrofit: Retrofit = Retrofit.Builder().
        addConverterFactory(ScalarsConverterFactory.create()).
        baseUrl(url).
        build()

        val service: PhotoAPI = retrofit.create(PhotoAPI::class.java)

        public interface IPhotoAPI
        {
            @GET("photos")
            fun getPhotos(): String
        }
    }
}