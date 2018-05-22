package cn.cestco.baselibrary.ui.activity

import cn.cestco.baselibrary.presenter.BasePresenter
import cn.cestco.baselibrary.presenter.view.BaseView

/**
 * 作者：RockQ on 2018/5/17
 * 邮箱：qingle6616@sina.com
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(),BaseView {
    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    lateinit var mPresenter: T
}