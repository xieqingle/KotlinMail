package cn.cestco.usercenter.data.repository

import cn.cestco.baselibrary.data.net.RetrofitFactory
import cn.cestco.baselibrary.data.protocal.BaseResp
import cn.cestco.baselibrary.rx.BaseObserver
import cn.cestco.usercenter.data.api.UserApi
import cn.cestco.usercenter.data.protocal.RequestReq
import io.reactivex.Observable
import javax.inject.Inject

/**
 * 作者：RockQ on 2018/5/17
 * 邮箱：qingle6616@sina.com
 */
class UserRepository @Inject constructor() {
    fun register(mobile: String, verifyCode: String, pwd: String): Observable<BaseResp<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java)
                .register(RequestReq(mobile, verifyCode, pwd))
    }

}