package demo.retrofit001.callback

import demo.retrofit001.presenter.MainView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

open class ProfileCallback<Profile>(var view: MainView): Callback<demo.retrofit001.model.Profile> {


    override fun onFailure(call: Call<demo.retrofit001.model.Profile>?, t: Throwable?) {
        view.displayText("FAILED")
    }

    override fun onResponse(call: Call<demo.retrofit001.model.Profile>, response: Response<demo.retrofit001.model.Profile>) {
        view.displayText(response.body().name)
    }

}
