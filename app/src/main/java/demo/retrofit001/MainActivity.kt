package demo.retrofit001

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import demo.retrofit001.presenter.MainPresenter
import demo.retrofit001.presenter.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    var mainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter.callServiceGetProfile()
    }

    override fun displayText(name: String) {
        tvName.text = name
    }

}
