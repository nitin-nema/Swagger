package com.example.Swagger.OpenAPI;


import com.example.Swagger.OpenAPI.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
