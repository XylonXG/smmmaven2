package com.xg.controller;

import com.xg.entity.User;
import com.xg.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/addUser")
    public ModelAndView addUser(User user){
        ModelAndView mav=new ModelAndView();
        userService.assUser(user);
        mav.getModel().put("user",user);
        mav.setViewName("/WEB-INF/jsp/success.jsp");
        return mav;
    }
}
