package cn.cestco.usercenter.presenter

import cn.cestco.baselibrary.ext.execute
import cn.cestco.baselibrary.presenter.BasePresenter
import cn.cestco.baselibrary.rx.BaseObserver
import cn.cestco.usercenter.data.service.UserService
import cn.cestco.usercenter.data.service.impl.UserServiceImpl
import cn.cestco.usercenter.presenter.view.RegisterView
import javax.inject.Inject

/**
 * 作者：RockQ on 2018/5/17
 * 邮箱：qingle6616@sina.com
 */
class RegisterPresenter @Inject constructor() : BasePresenter<RegisterView>() {
    @Inject
    lateinit var userService: UserServiceImpl

    fun register(name: String, verifyCode: String) {
        userService.register(name, verifyCode, "")
                .execute(object : BaseObserver<Boolean>() {
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }

                }, lifecycleProvider)
    }
}

