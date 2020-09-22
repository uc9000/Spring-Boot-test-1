package com.example.test2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController{
    @RequestMapping("home")
    public ModelAndView home(){
        User u = new User("Jordan",1);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", u);
        System.out.println("home called");
        mv.setViewName("home");
        return mv;
    }
}