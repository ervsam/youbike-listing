package com.example.youbikelisting

class Repository {
    suspend fun getPost(): List<DataModel> {
        return RetrofitInstance.api.getPosts()
    }
}