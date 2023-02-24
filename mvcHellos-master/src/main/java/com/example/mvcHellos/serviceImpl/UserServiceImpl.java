package com.example.mvcHellos.serviceImpl;

import com.example.mvcHellos.model.User;
import com.example.mvcHellos.repository.UserRepository;
import com.example.mvcHellos.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  final UserRepository userRepository;

    @Override
    public List<User> getAllStudents() {
        return userRepository.findAll();
    }

    @Override
    public User saveStudent(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteStudent(User user) {
        userRepository.delete(user);
    }

    @Override
    public User getStudentById(Long id) {
        return userRepository.findById(id).orElseThrow( () -> new IllegalStateException());

    }

    @Override
    public User updateStudent(User user) {
        return userRepository.save(user);
    }

}
