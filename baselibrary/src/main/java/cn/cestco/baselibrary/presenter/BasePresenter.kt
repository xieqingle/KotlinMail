package cn.cestco.baselibrary.presenter

import cn.cestco.baselibrary.presenter.view.BaseView

/**
 * 作者：RockQ on 2018/5/17
 * 邮箱：qingle6616@sina.com
 */
open class BasePresenter<T : BaseView> {
    lateinit var mView: T
}