package com.example.mvcHellos.serviceImpl;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@Service
public class MainServiceImpl {
private final TeacherServiceImpl teacherService;
private final  UserServiceImpl userService;






}
