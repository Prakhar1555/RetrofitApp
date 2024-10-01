package com.example.retrofitapp

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

interface AlbumService   {

    @GET("/albums")
    suspend fun getAlbums() : Response<Albums>
    @GET("/albums")
    suspend fun getSpecificAlbums(@Query("userId") userId:Int):Response<Albums>

}