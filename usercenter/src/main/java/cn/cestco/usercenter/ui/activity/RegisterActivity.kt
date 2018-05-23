package cn.cestco.usercenter.ui.activity

import android.os.Bundle
import cn.cestco.baselibrary.ui.activity.BaseMvpActivity
import cn.cestco.usercenter.R
import cn.cestco.usercenter.presenter.RegisterPresenter
import cn.cestco.usercenter.presenter.view.RegisterView

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun onRegisterResult(result: Boolean) {
        super.onRegisterResult(result)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
}
