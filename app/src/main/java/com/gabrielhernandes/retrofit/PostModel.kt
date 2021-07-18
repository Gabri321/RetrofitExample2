package com.gabrielhernandes.retrofit

import com.google.gson.annotations.SerializedName

data class PostModel(

    @SerializedName("userId")
    var userId: Int = 0,
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("title")
    var title: String = "",
    @SerializedName("body")
    var body: String = ""

)