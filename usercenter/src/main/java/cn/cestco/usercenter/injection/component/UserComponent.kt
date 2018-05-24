package cn.cestco.usercenter.injection.component

import android.support.v7.app.AppCompatActivity
import cn.cestco.baselibrary.injection.PerComponentScope
import cn.cestco.baselibrary.injection.component.ActivityComponent
import cn.cestco.usercenter.injection.module.UserModule
import cn.cestco.usercenter.ui.activity.UserCenterActivity
import dagger.Component

/**
 * 作者：RockQ on 2018/5/23
 * 邮箱：qingle6616@sina.com
 */
@PerComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class), modules = arrayOf(UserModule::class))
interface UserComponent {
    fun inject(activity: UserCenterActivity)
}