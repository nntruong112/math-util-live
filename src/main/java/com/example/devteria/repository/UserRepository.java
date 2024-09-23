package com.example.devteria.repository;

import com.example.devteria.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
//mỗi request đi qua 3 layer sau, controller, service, repository, repository tương tác trực tiếp với dbms
//JPA tự động generate code trong interface

}
