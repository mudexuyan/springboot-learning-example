package edu.hfut.wangyu.domain;

import edu.hfut.wangyu.dal.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    void insertUser(@Param("user") User user);

    void updateUser(@Param("user") User user);

}
