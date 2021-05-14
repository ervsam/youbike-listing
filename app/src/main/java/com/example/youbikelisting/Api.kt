package com.example.youbikelisting

import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("api/datasets/71CD1490-A2DF-4198-BEF1-318479775E8A/json")
    suspend fun getPosts(): List<DataModel>
}