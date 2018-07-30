package org.gongtao.serviceImpl;

import org.gongtao.bean.UserExample;
import org.gongtao.mapper.UserMapper;
import org.gongtao.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl extends LoginService {
    @Autowired
    private UserMapper userMapper;

    public boolean login(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria();
        return false;
    }
}
