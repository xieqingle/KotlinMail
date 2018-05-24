package cn.cestco.baselibrary.rx

import cn.cestco.baselibrary.data.protocal.BaseResp
import io.reactivex.Observable
import io.reactivex.functions.Function

/**
 * 作者：RockQ on 2018/5/24
 * 邮箱：qingle6616@sina.com
 */
class BaseFunBoolean<T> : Function<BaseResp<T>, Observable<Boolean>> {

    override fun apply(input: BaseResp<T>): Observable<Boolean> {
        return if (input.status != 0) {
            Observable.just(false)
        } else {
            Observable.just(true)
        }
    }

}