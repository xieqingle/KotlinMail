package cn.cestco.baselibrary.ext

import cn.cestco.baselibrary.rx.BaseObserver
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * 作者：RockQ on 2018/5/17
 * 邮箱：qingle6616@sina.com
 */
fun <T> Observable<T>.execute(baseObserver: BaseObserver<T>) {
    this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(baseObserver)

}