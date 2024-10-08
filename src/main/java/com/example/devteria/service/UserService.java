package com.example.devteria.service;

import com.example.devteria.dto.request.UserCreationRequest;
import com.example.devteria.dto.request.UserUpdateRequest;
import com.example.devteria.entity.User;
import com.example.devteria.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //tạo 1 user
    public User createUser(UserCreationRequest request){
        User user = new User();
        //map dữ liệu vào user
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userRepository.save(user); //tạo 1 cái row mới trong table

    }

    public User updateUser(String userId, UserUpdateRequest request){
        User user = getUser(userId);

        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(String id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found")); //nếu tìm thấy user sẽ trả về, else báo lỗi

    }

    public void deleteUser(String userId){
        userRepository.deleteById(userId);
    }

}
