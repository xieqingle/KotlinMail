package cn.cestco.baselibrary.injection.module

import com.trello.rxlifecycle2.LifecycleProvider
import dagger.Module
import dagger.Provides

/**
 * 作者：RockQ on 2018/5/24
 * 邮箱：qingle6616@sina.com
 */
@Module
class LifecycleProviderModule(private val lifecycleProvider: LifecycleProvider<*>) {
    @Provides
    fun providerLifecycleProvider(): LifecycleProvider<*> {
        return lifecycleProvider
    }
}