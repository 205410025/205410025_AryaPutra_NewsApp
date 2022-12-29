package com.aryaputra.newsapp.data.remote

import com.aryaputra.newsapp.data.model.NewsResponse
import com.aryaputra.newsapp.util.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
//class interface
interface NewsApi {
    //mendapatkan v2/top-headlines
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        //kode negara, id merupakan kode negara indonesia
        @Query("country") countryCode: String = "id",
        @Query("page") pageNumber: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    ): Response<NewsResponse>
    //mendapatkan v2/everything
    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q") searchQuery: String,
        @Query("page") pageNumber: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    ): Response<NewsResponse>

}