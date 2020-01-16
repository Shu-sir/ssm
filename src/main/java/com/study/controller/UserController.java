package com.study.controller;

import com.study.model.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @autor Administrator
 * @date 2020/1/16 11:12
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/select")
    public ModelAndView selectUser(){
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUser(1);
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }
}
