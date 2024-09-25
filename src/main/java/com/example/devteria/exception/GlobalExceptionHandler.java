package com.example.devteria.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler { //khi có 1 cái exception xảy ra thì class này sẽ chịu trách nhiệm
    //define cac loai exception
    //tuong ung voi tung` exception trả về như thế nào

    @ExceptionHandler(value = RuntimeException.class)
    ResponseEntity<String> handlingRuntimeException(RuntimeException exception){
        return ResponseEntity.badRequest().body(exception.getMessage()); //nội dung trả về cho người dùng
    }

}
