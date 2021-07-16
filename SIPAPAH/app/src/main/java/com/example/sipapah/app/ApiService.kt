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

    @GET("notifikasi/user/{id}")
    fun getnotifikasi(
            @Path("id") id: Int
    ):Call<ResponModel>

    @FormUrlEncoded
    @POST("layanan/pesan/{id}")
    fun setmemesan(

            @Field("category_id") category_id:Int,
            @Field("file") file:String,
            @Field("tanggaljemput") tanggaljemput:String,
            @Field("keterangan") keterangan:String

    ):Call<ResponModel>

}