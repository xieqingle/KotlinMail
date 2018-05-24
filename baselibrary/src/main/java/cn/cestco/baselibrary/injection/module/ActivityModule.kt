package cn.cestco.baselibrary.injection.module

import android.app.Activity
import cn.cestco.baselibrary.common.BaseApplication.Companion.context
import cn.cestco.baselibrary.injection.ActivityScope
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * 作者：RockQ on 2018/5/23
 * 邮箱：qingle6616@sina.com
 */
@Module
class ActivityModule(private val activity: Activity) {
    @ActivityScope
    @Provides
    fun providerActivity(): Activity {
        return activity
    }

}