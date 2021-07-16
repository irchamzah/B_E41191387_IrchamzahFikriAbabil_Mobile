package com.example.sipapah.app

import com.example.sipapah.model.ResponModel
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface ApiService{

    @FormUrlEncoded
    @POST("register")
    fun register(

        @Field("name") name:String,
        @Field("email") email:String,
        @Field("password") password:String

        ):Call<ResponModel>

    @FormUrlEncoded
    @POST("login")
    fun login(

        @Field("email") email:String,
        @Field("password") password:String

        ):Call<ResponModel>

    @GET("kreasi")
    fun getkreasi():Call<ResponModel>

//    @GET("notifikasi")
//    fun getnotifikasi():Call<ResponModel>

    @GET("notifikasi/user/{id}")
    fun getnotifikasi(
            @Path("id") id: Int
    ):Call<ResponModel>

}