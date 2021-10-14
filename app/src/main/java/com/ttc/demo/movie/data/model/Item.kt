package com.ttc.demo.movie.data.model

import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("iso_639_1")
    val iso_639_1: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("featured")
    val featured: Int?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("revenue")
    val revenue: String?,
    @SerializedName("public")
    val public: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("updated_at")
    val updated_at: String?,
    @SerializedName("created_at")
    val created_at: String?,
    @SerializedName("sort_by")
    val sort_by: Int?,
    @SerializedName("backdrop_path")
    val backdrop_path: String?,
    @SerializedName("runtime")
    val runtime: Int?,
    @SerializedName("average_rating")
    val average_rating: Long?,
    @SerializedName("iso_3166_1")
    val iso_3166_1: String?,
    @SerializedName("adult")
    val adult: Int?,
    @SerializedName("number_of_items")
    val number_of_items: Int?,
    @SerializedName("poster_path")
    val poster_path: String?
)