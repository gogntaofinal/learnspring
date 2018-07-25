package org.gongtao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Login {
    /**
     * @param model 返回的model对象.
     * @return a random string.
     * @throws Exception depence .
     */
    @RequestMapping(value = {"/login"}, method = {RequestMethod.GET})
    @ResponseBody
    public final String loginAction(final Model model) throws Exception {
        final String res = "Hello world.";
        return res;
    }
}
