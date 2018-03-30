package demo.retrofit001.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal fun createRetrofit(): Retrofit {

    return Retrofit.Builder()
            .baseUrl("http://192.168.201.176:8888")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
}