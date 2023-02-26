package com.example.mvcHellos.serviceImpl;

import com.example.mvcHellos.model.Teacher;
import com.example.mvcHellos.model.User;
import com.example.mvcHellos.repository.TeacherRepository;
import com.example.mvcHellos.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;


    @Override
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }



}
