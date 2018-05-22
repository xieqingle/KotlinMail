package cn.cestco.baselibrary.rx

import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * 作者：RockQ on 2018/5/17
 * 邮箱：qingle6616@sina.com
 */
open  class BaseObserver<T> : Observer<T> {
    override fun onNext(t: T) {
    }

    override fun onComplete() {
    }

    override fun onSubscribe(d: Disposable) {
    }


    override fun onError(e: Throwable) {
    }
}