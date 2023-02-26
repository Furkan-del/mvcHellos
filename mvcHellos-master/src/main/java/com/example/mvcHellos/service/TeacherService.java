package com.example.mvcHellos.service;


import com.example.mvcHellos.model.Teacher;
import com.example.mvcHellos.model.User;
import com.example.mvcHellos.repository.TeacherRepository;

import java.util.List;

public interface TeacherService {
  public List<Teacher> getAllTeacher();

  public Teacher saveTeacher(Teacher teacher);

  public Teacher getTeacherById(Long id);



}
