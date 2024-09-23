package com.example.devteria.controller;


import com.example.devteria.dto.request.UserCreationRequest;
import com.example.devteria.dto.request.UserUpdateRequest;
import com.example.devteria.entity.User;
import com.example.devteria.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") //dùng annotation này thì có thể bỏ các users khác cho ngắn gọn
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping() //endpoint users voi method POST, users đặt có s vì nó là invention trong việc đặt tên API
    User createUser (@RequestBody UserCreationRequest request){
        return userService.createUser(request);
    }

    @GetMapping()
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{userId}") //khai báo biến trên path dùng {}
    User getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }

    //update thong tin
    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/userId}")
    String deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
        return "User has been deleted";
    }
}
