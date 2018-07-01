package com.xg.serviceImpl;

import com.xg.entity.User;
import com.xg.mapper.UserMapper;
import com.xg.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    public void assUser(User user) {
        userMapper.addUser(user);

    }
}
