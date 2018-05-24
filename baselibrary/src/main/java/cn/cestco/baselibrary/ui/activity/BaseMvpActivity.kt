package cn.cestco.baselibrary.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import cn.cestco.baselibrary.common.BaseApplication
import cn.cestco.baselibrary.injection.component.ActivityComponent
import cn.cestco.baselibrary.injection.component.DaggerActivityComponent
import cn.cestco.baselibrary.injection.module.ActivityModule
import cn.cestco.baselibrary.injection.module.AppModule
import cn.cestco.baselibrary.injection.module.LifecycleProviderModule
import cn.cestco.baselibrary.presenter.BasePresenter
import cn.cestco.baselibrary.presenter.view.BaseView
import javax.inject.Inject

/**
 * 作者：RockQ on 2018/5/17
 * 邮箱：qingle6616@sina.com
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Inject
    lateinit var mPresenter: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInject()
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

    }

    protected lateinit var activityComponent: ActivityComponent
    private fun initActivityInject() {
        activityComponent = DaggerActivityComponent.builder()
                .appComponent((application as BaseApplication).appComponent)
                .activityModule(ActivityModule(this))
                .lifecycleProviderModule(LifecycleProviderModule(this))
                .build()
    }
}