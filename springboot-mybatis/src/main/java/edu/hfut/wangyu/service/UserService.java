package edu.hfut.wangyu.service;

import edu.hfut.wangyu.dal.User;
import edu.hfut.wangyu.domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户业务接口类
 */
public interface UserService {

    void insertAdder(User user);

    void updateAdder(User user);
}
