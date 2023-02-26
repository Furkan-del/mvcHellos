package com.example.mvcHellos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "teacher")
public class Teacher {
    @Id
    private Long id;
    private String name;
    private String surName;
    private int teacherNumber;


}
