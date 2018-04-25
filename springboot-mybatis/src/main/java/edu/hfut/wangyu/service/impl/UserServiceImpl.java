package edu.hfut.wangyu.service.impl;

import edu.hfut.wangyu.dal.User;
import edu.hfut.wangyu.domain.UserMapper;
import edu.hfut.wangyu.service.UserService;
import org.assertj.core.util.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public void insertAdder(User user) {

        Preconditions.checkNotNull(user, "user is null");
        userMapper.insertUser(user);
    }

    @Override
    public void updateAdder(User user) {

        Preconditions.checkNotNull(user, "user is null");
        userMapper.updateUser(user);

    }
}
