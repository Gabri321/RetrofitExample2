package com.gabrielhernandes.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient private constructor() {

    companion object {

        private lateinit var retrofit: Retrofit
        private val baseUrl = "https://jsonplaceholder.typicode.com/"
        private val client = OkHttpClient.Builder().build()

        private fun getRetrofitInstance(): Retrofit {

            if (!::retrofit.isInitialized) {

                retrofit = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build()

            }

            return retrofit


        }

        fun <S> buildService(service: Class<S>): S {
            return getRetrofitInstance().create(service)
        }
    }
}