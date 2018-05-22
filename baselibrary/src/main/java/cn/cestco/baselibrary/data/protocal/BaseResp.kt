package cn.cestco.baselibrary.data.protocal

/**
 * 作者：RockQ on 2018/5/17
 * 邮箱：qingle6616@sina.com
 */
class BaseResp<T>(val status: Int, val message: String, val data: T) {
}