package com.priyanka.productscreenapplication.Model.API


import com.priyanka.productscreenapplication.Model.Data.Product
import com.priyanka.productscreenapplication.Model.Data.User
import retrofit2.http.GET

interface  ApiService {
    @GET("products")
    suspend fun getProducts(): List<Product>

    @GET("users")
    suspend fun getUsers(): List<User>
}
