package com.example.devteria.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class UserUpdateRequest {
    private String id;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dob;

}
