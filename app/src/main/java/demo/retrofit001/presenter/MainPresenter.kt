package demo.retrofit001.presenter

import demo.retrofit001.api.ProfileAPI
import demo.retrofit001.callback.ProfileCallback
import demo.retrofit001.model.Profile
import demo.retrofit001.network.createRetrofit
import retrofit2.Retrofit

class MainPresenter(var view: MainView) {

    fun callServiceGetProfile() {
        val retrofit: Retrofit = createRetrofit()
        val profileAPI = retrofit.create(ProfileAPI::class.java)
        profileAPI.getProfile().enqueue(object : ProfileCallback<Profile>(view) {})
    }
}