package com.example.cekin.Logic.Retrofit
import com.example.cekin.ui.WelcomePage.Login.LoginResponse
import com.example.cekin.ui.WelcomePage.SignUp.RegisterResponse
import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Field


interface ApiService {
    @POST("register")
    @FormUrlEncoded
    fun register(
        @Field("usernama") username: String,
        @Field("email") email: String,
        @Field("password") password: String,
        @Field("confirmPassword") confirmPassword: String
    ): Call<RegisterResponse>

    @POST("login")
    @FormUrlEncoded
    suspend fun login(
        @Field("email") email: String,
        @Field("password") password: String,
    ): LoginResponse

}