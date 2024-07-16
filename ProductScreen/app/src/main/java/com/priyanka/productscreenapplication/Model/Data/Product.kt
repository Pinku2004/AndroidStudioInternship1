package com.priyanka.productscreenapplication.Model.Data

//Model Class
data class Product(
    val id: Int,
    val title: String,
    val price: Double,
    val description: String,
    val category: String,
    val image: String,
    val rating: Ratings
)
data class Ratings(
    val rate: Double,
    val count: Int
)