package cn.cestco.usercenter.injection.component

import android.support.v7.app.AppCompatActivity
import cn.cestco.usercenter.injection.module.UserModule
import dagger.Component

/**
 * 作者：RockQ on 2018/5/23
 * 邮箱：qingle6616@sina.com
 */
@Component(modules = arrayOf(UserModule::class))
interface UserComponent {
    fun inject(activity: AppCompatActivity)
}