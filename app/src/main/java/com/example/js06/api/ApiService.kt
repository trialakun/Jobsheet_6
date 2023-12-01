package com.example.js06.api

import retrofit2.Call
import com.example.js06.ResponseMorty
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>
}