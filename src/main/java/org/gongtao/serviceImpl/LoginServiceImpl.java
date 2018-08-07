package org.gongtao.serviceImpl;

import org.gongtao.bean.User;
import org.gongtao.bean.UserExample;
import org.gongtao.mapper.UserMapper;
import org.gongtao.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    public boolean login(String username, String password) {
        System.out.println(username + password);
        UserExample userExample = new UserExample();
//        if("".equals(username) || !StringUtils.isEmpty(username))

        userExample.createCriteria().andUsernameEqualTo("test1").andPasswordEqualTo("1234");
        try{
            List<User> cur_user = userMapper.selectByExample(userExample);
            int userNum = cur_user.size();
            System.out.println(" userNum is " + userNum);
            if(userNum != 0) {
                System.out.println("Hello world");
                return true;
            }

        }catch (Exception e) {
            e.getMessage();
        }
        return false;
    }
}
