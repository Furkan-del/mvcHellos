package com.example.mvcHellos.controller;

import com.example.mvcHellos.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainPageController {

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/login")
    public String redirect() {
        return "login";
    }

    @GetMapping("/message")
    public String loginPage() {
        return "message";
    }


    @GetMapping("/info")
    public String infoPage() {
        return "info";
    }

    @GetMapping("register")
    public String userRegistrationPage(Model model) {

        User user = new User();
        model.addAttribute("user", user);

        return "message";
    }

    @PostMapping("register/save")
    public String submitForm(Model model, @ModelAttribute("user") User user) {
        model.addAttribute("user", user);
        return "/registersucces";
    }

    /*
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public ModelAndView showForm(){
        return  new ModelAndView("userHome","user",new User());
    }
    @RequestMapping(value = "/adduser",method = RequestMethod.POST)
    public String submit(@ModelAttribute("userss") User user, BindingResult bindingResult, ModelMap map){
        if(bindingResult.hasErrors()){
            return  "error";
        }
        map.addAttribute("fname",user.getFname());
        map.addAttribute("lname",user.getLname());

        map.addAttribute("age",user.getAge());

        map.addAttribute("education",user.getEducation());
        return "userview";

    }
*/


}
