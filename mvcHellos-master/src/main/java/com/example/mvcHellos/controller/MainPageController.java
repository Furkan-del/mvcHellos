package com.example.mvcHellos.controller;

import com.example.mvcHellos.model.User;
import com.example.mvcHellos.serviceImpl.UserServiceImpl;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getStudentById(id));
        return "edit_student";

    }

    @GetMapping("students/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        User users = userService.getStudentById(id);
        userService.deleteStudent(users);
        return "redirect:/students";
    }

    @PostMapping("students/{id}")
    public String updateStudentForm(@PathVariable Long id, User user) {
        User existingUser = userService.getStudentById(id);
        existingUser.setFirstname(user.getFirstname());
        existingUser.setLastname(user.getLastname());
        existingUser.setEmail(user.getEmail());
        userService.updateStudent(user);
        return "redirect:/students";
    }

}