package com.priyanka.productscreenapplication.Model.Repository


import com.priyanka.productscreenapplication.Model.API.ApiService
import com.priyanka.productscreenapplication.Model.Data.Product

class ProductRepository(private val apiService: ApiService){
    suspend fun getProducts(): List<Product>{
        return apiService.getProducts()
    }
}