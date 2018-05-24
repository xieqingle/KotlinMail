package cn.cestco.baselibrary.rx

import cn.cestco.baselibrary.common.ResultCode
import cn.cestco.baselibrary.data.protocal.BaseResp
import rx.Observable
import rx.functions.Func1

/*
    通用数据类型转换封装
 */
class BaseFunc<T>:Func1<BaseResp<T>,Observable<T>>{
    override fun call(t: BaseResp<T>): Observable<T> {
        if (t.status != ResultCode.SUCCESS){
            return Observable.error(BaseException(t.status,t.message))
        }

        return Observable.just(t.data)
    }
}
