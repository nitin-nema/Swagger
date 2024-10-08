package com.example.Swagger.OpenAPI.UserManagment;


import com.example.Swagger.OpenAPI.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
