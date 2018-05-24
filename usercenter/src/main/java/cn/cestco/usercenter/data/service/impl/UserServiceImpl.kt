package cn.cestco.usercenter.data.service.impl

import cn.cestco.baselibrary.data.protocal.BaseResp
import cn.cestco.baselibrary.rx.BaseFunBoolean
import cn.cestco.usercenter.data.repository.UserRepository
import cn.cestco.usercenter.data.service.UserService
import io.reactivex.Observable
import io.reactivex.functions.Function
import javax.inject.Inject

/**
 * 作者：RockQ on 2018/5/17
 * 邮箱：qingle6616@sina.com
 */
class UserServiceImpl @Inject constructor() : UserService {
    @Inject
    lateinit var userRepository: UserRepository

    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return userRepository.register(mobile, verifyCode, pwd)
                .flatMap(BaseFunBoolean())
//                .flatMap(Function { baseResp ->
//                    if (baseResp.status != 0)
//                        return@Function Observable.just(true)
//                    else
//                        return@Function Observable.just(false)
//                })
//                .flatMap(Func1 { t ->
//                    if (t == null)
//                        return@Func1 Observable.just(false)
//                    if (t.status != 0) {
//                        return@Func1 Observable.just(true)
//                    }
//                    Observable.just(false)
//                })
    }

}

//private fun <T> Observable<T>.flatMap(func1: Func1<T, Observable<Boolean>>): Observable<Boolean> {
//    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//}
