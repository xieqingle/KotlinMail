package cn.cestco.baselibrary.common

import android.app.Application
import android.content.Context
import cn.cestco.baselibrary.injection.component.AppComponent
import cn.cestco.baselibrary.injection.component.DaggerAppComponent
import cn.cestco.baselibrary.injection.module.AppModule

/**
 * 作者：RockQ on 2018/5/23
 * 邮箱：qingle6616@sina.com
 */
class BaseApplication : Application() {
    lateinit var appComponent: AppComponent

    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = this
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}
