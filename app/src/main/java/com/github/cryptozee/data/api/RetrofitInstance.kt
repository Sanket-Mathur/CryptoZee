package com.github.cryptozee.data.api

import com.github.cryptozee.utils.CONSTANTS.Companion.URL_API_COINGECKO
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitInstance {
    private val retrofit by lazy{
        //Building Retrofit Instance
        Retrofit.Builder()
            .baseUrl(URL_API_COINGECKO)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
    val responseAllApi: AllApiRequests by lazy {
        retrofit.create(AllApiRequests::class.java)
    }
}