package com.priyanka.productscreenapplication.Model.Repository

import com.priyanka.productscreenapplication.Model.API.ApiService
import com.priyanka.productscreenapplication.Model.Data.Product
import com.priyanka.productscreenapplication.Model.Data.User


class UserRepository(private val apiService: ApiService) {
    suspend fun getUsers(): List<User> {
        return  apiService.getUsers()
    }
}