package com.example.mvcHellos.controller;

import com.example.mvcHellos.model.User;
import com.example.mvcHellos.serviceImpl.TeacherServiceImpl;
import com.example.mvcHellos.serviceImpl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
@AllArgsConstructor
public class TeachersController {

    private final TeacherServiceImpl teacherService;

    private final UserServiceImpl userService;

   /* @GetMapping("/students/save")
    public String createTeacherForm(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "create_student";
    }*/


    @PostMapping("teachers")
    public String saveTeachers(@ModelAttribute("user") User user){

        userService.saveStudent(user);
        return "redirect:/teachers";
    }
    @GetMapping("teachers")
    public String showTeacherss(Model model){
        model.addAttribute("user", userService.getAllStudents());
        return "teachers";
    }



}
