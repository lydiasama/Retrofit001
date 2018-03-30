package demo.retrofit001.api

import demo.retrofit001.model.Profile
import retrofit2.Call
import retrofit2.http.GET

interface ProfileAPI {

    @GET("/profile")
    fun getProfile(): Call<Profile>
}