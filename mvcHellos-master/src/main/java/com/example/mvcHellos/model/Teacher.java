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
    @Column(name="name")
    private String name;

    @Column(name="surName")
    private String surName;

    @Column(name="teacherNumber")
    private int teacherNumber;


}
