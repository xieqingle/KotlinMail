package cn.cestco.usercenter.ui.activity

import android.os.Bundle
import cn.cestco.baselibrary.ui.activity.BaseMvpActivity
import cn.cestco.usercenter.R
import cn.cestco.usercenter.presenter.RegisterPresenter
import cn.cestco.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_user_center.*
import org.jetbrains.anko.toast

class UserCenterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {
    override fun onRegisterResult(result: Boolean) {
        super.onRegisterResult(result)
        if (result)
            toast("注册成功")
        else
            toast("注册失败")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_center)
        mPresenter = RegisterPresenter()
        mPresenter.mView = this
        mIvToast.setOnClickListener({ mPresenter.register("xieqingle", "123456") })

    }
}
