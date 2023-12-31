package com.example.apiv2

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getDogsByBreads(@Url url:String):Response<DogResponse>
}