package com.jikexueyuan.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by caochenghua on 2017/4/23.
 */



@Service
public class LoginService {
    public ModelAndView doLogin(String loginPageUrl, String successPageUrl, String uname, String password) {
        if (uname==null || "".equals(uname)) {
            return new ModelAndView(loginPageUrl,"error","用户名不能为空");
        }

        if (password==null || "".equals(password)) {
            return new ModelAndView(loginPageUrl,"error","密码不能为空");
        }

        if (uname.equals("admin") && password.equals("123")) {
            return new ModelAndView(successPageUrl);
        }

        return new ModelAndView(loginPageUrl,"error","用户名或者密码错误");
    }
}
