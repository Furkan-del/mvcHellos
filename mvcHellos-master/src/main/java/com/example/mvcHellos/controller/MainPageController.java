package com.example.mvcHellos.controller;

import com.example.mvcHellos.model.User;
import com.example.mvcHellos.serviceImpl.UserServiceImpl;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@Controller
public class MainPageController {

    private final UserServiceImpl userService;

    @GetMapping("/students")
    public String getStudents(Model model) {
        model.addAttribute("users", userService.getAllStudents());
        return "students";
    }


    @GetMapping("/students/save")
    public String createStudentForm(Model model) {
        //create  user object to hold user form data
        User user = new User();
        model.addAttribute("user", user);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("user") User user) {
//özelliklerini aldığı user ı kaydeder ve basar yönlendirmeyle
        userService.saveStudent(user);
        return "redirect:/students";
    }
    @GetMapping("students/edit/{id}")
    public String editStudentForm(@PathVariable Long id,Model model){
        model.addAttribute("user",userService.getStudentById(id));
        return  "edit_student";

    }


}
