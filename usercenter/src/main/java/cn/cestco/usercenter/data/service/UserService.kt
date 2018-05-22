package cn.cestco.usercenter.data.service

import io.reactivex.Observable

/**
 * 作者：RockQ on 2018/5/17
 * 邮箱：qingle6616@sina.com
 */
interface UserService {
    fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean>
}