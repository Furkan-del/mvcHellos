package com.example.mvcHellos.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name="email")
    private String email;
}
