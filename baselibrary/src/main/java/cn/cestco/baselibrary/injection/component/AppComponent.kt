package cn.cestco.baselibrary.injection.component

import android.content.Context
import cn.cestco.baselibrary.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * 作者：RockQ on 2018/5/23
 * 邮箱：qingle6616@sina.com
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun context(): Context
}