package com.gabrielhernandes.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface PostService {
    @GET("https://jsonplaceholder.typicode.com/posts")
    fun getPost(): Call<ArrayList<PostModel>>
}