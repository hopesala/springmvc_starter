//package com.jikexueyuan.controller;
//
//import com.jikexueyuan.service.LoginService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//
///**
// * Created by caochenghua on 2017/4/23.
// */
//
//
//
//@Controller
//public class LoginController {
//    @Resource
//    LoginService service;
//
//    @Resource
//    HttpServletRequest request;
//
//    @RequestMapping("index")
//    public ModelAndView toLoginPage() {
//        return new ModelAndView("WEB-INF/jsp/login.jsp");
//    }
//
//    public ModelAndView doLogin() {
//        String loginPageUrl = "WEB-INF/jsp/login.jsp";
//        String successPageUrl = "WEB-INF/jsp/success.jsp";
//
//        String uname= request.getParameter("uname");
//        String password=request.getParameter("password");
//
//        return service.doLogin(loginPageUrl,successPageUrl,uname,password);
//    }
//}
