package com.herman.springherman.service.impl;

import com.herman.springherman.dao.HermanUserMapper;
import com.herman.springherman.model.HermanUser;
import com.herman.springherman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: java类作用描述
 * @Author: Herman
 * @CreateDate: 2018/11/18 15:44
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private HermanUserMapper hermanUserMapper;

    @Override
    public HermanUser getUser(long id) {
        return hermanUserMapper.selectByPrimaryKey(id);
    }
}
