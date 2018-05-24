package cn.cestco.baselibrary.presenter

import cn.cestco.baselibrary.presenter.view.BaseView
import com.trello.rxlifecycle2.LifecycleProvider
import com.trello.rxlifecycle2.RxLifecycle
import javax.inject.Inject

/**
 * 作者：RockQ on 2018/5/17
 * 邮箱：qingle6616@sina.com
 */
open class BasePresenter<T : BaseView> {
    lateinit var mView: T
    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<*>
}