package cn.cestco.usercenter.injection.module

import cn.cestco.usercenter.data.service.UserService
import cn.cestco.usercenter.data.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 * 作者：RockQ on 2018/5/23
 * 邮箱：qingle6616@sina.com
 */
@Module
class UserModule {
    @Provides
    fun providesUserService(service: UserServiceImpl): UserService {
        return service

    }
}