package com.ttc.demo.movie.data.model

import com.google.gson.annotations.SerializedName
import com.ttc.demo.movie.data.model.Item

data class UpComResponse(
    @SerializedName("items")
    val items: List<Item>?
)