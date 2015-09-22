package com.showshine.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.showshine.dao.IUserDao;
import com.showshine.model.UserEntity;
import com.showshine.service.IUserService;

@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;
 
    public boolean isExist(UserEntity user) {
        return userDao.isExist(user);
    }
 
}
