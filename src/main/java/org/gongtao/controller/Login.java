package org.gongtao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Login {
    /**
     * @param password 返回的model对象.
     * @return a random string.
     */
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    @ResponseBody
    public final boolean loginAction(String username, String password) throws Exception{
        if(username.equals("root") && password.equals("root")) {
            return true;
        }else{
            return false;
        }
    }
}
