package com.example.mvcHellos.service;

import com.example.mvcHellos.model.User;

import java.util.List;

public interface UserService
{
    public List<User>getAllStudents();

    public User saveStudent(User user);

    public User getStudentById(Long id);
    public User updateStudent(User user);
}
