package com.example.devteria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) //UUID tức là những chuỗi đã được random ngẫu nhiên và không trùng lặp
    //private long id;
    private String id;
    private String password;
    private String username;
    private String firstName;
    private String lastName;
    private LocalDate dob;

}
