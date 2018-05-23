package cn.cestco.baselibrary.injection.component

import android.app.Activity
import cn.cestco.baselibrary.injection.ActivityScope
import cn.cestco.baselibrary.injection.module.ActivityModule
import cn.cestco.baselibrary.injection.module.AppModule
import dagger.Component

/**
 * 作者：RockQ on 2018/5/23
 * 邮箱：qingle6616@sina.com
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun context(): Activity
}