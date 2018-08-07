package org.gongtao.controller;

import org.gongtao.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Login {
    /**
     * 用户服务接口
     */
    @Autowired
    private LoginService loginService;

    /**
     * @param password 返回的model对象.
     * @return a random string.
     */
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    @ResponseBody
    public final boolean loginAction(String username, String password) throws Exception{
        System.out.println(username + password);
        return loginService.login(username, password);
    }
}
