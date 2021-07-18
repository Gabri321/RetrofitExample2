package com.gabrielhernandes.retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var request = RetrofitClient.buildService(PostService::class.java)
        var call = request.getPost()


        call.enqueue(object : Callback<ArrayList<PostModel>> {
            override fun onResponse(
                call: Call<ArrayList<PostModel>>,
                response: Response<ArrayList<PostModel>>
            ) {
                var response = response.body()
            }

            override fun onFailure(call: Call<ArrayList<PostModel>>, t: Throwable) {
                var t = t.message
            }

        })
    }
}