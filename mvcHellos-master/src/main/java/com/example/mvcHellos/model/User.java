package com.example.mvcHellos.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "userss")
@Entity
public class User {
    @Id
    private Long id;
    @Column(name = "firstname")
    private String fname;
    @Column(name = "lastname")
    private String lname;
    @Column(name="email")
    private String email;
}
