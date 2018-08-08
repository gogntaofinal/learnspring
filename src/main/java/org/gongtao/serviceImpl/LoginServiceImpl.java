package org.gongtao.serviceImpl;

import org.gongtao.mapper.LoginMapper;
import org.gongtao.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    public boolean login(String username, String password) {
        int userNum = 0;
        try{
            userNum = loginMapper.isPermiteUser(username, password);

        }catch (Exception e) {
            e.getMessage();
        }
        if(0 != userNum) {
            return true;
        }else{
            System.out.println("aiaiaiai");
            return false;
        }
    }
}
