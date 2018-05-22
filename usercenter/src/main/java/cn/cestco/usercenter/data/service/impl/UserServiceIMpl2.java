package cn.cestco.usercenter.data.service.impl;

import cn.cestco.baselibrary.data.protocal.BaseResp;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/**
 * 作者：RockQ on 2018/5/18
 * 邮箱：qingle6616@sina.com
 */
public class UserServiceIMpl2 {
    public Observable<Boolean> register(Observable<BaseResp<String>> baseRespObservable) {
        return baseRespObservable.flatMap(new Function<BaseResp<String>, ObservableSource<Boolean>>() {
            @Override
            public ObservableSource<Boolean> apply(BaseResp<String> stringBaseResp) throws Exception {
                if (stringBaseResp.getStatus() != 0) {
                    return Observable.just(false);
                }
                return Observable.just(true);
            }
        });
    }

}
