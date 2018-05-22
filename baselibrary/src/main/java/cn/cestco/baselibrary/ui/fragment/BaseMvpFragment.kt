package cn.cestco.baselibrary.ui.fragment

import cn.cestco.baselibrary.presenter.BasePresenter
import cn.cestco.baselibrary.presenter.view.BaseView
import cn.cestco.baselibrary.ui.activity.BaseActivity

/**
 * 作者：RockQ on 2018/5/22
 * 邮箱：qingle6616@sina.com
 */
open class BaseMvpFragment<T : BasePresenter<*>> : BaseFragment(), BaseView {
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