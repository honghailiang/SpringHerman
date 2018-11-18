package com.herman.springherman.service;

import com.herman.springherman.model.HermanUser;

/**
 * @Description: 用户服务类接口
 * @Author: Herman
 * @CreateDate: 2018/11/18 15:41
 */
public interface UserService {
    HermanUser getUser(long id);
}
