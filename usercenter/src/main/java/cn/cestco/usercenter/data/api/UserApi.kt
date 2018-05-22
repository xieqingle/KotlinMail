package cn.cestco.usercenter.data.api

import cn.cestco.baselibrary.data.protocal.BaseResp
import cn.cestco.baselibrary.rx.BaseObserver
import cn.cestco.usercenter.data.protocal.RequestReq
import io.reactivex.Observable
import retrofit2.http.Body

/**
 * 作者：RockQ on 2018/5/17
 * 邮箱：qingle6616@sina.com
 */
interface UserApi {

    fun register(@Body req: RequestReq): Observable<BaseResp<String>>
}