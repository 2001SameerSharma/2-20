package com.example.repository;

import com.example.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // JpaRepository provides CRUD methods like save(), findAll(), findById(), deleteById(), etc.
    // You can define custom methods if needed, for example:
    
    // Find a book by its name
    Book findByName(String name);

    // Find all books that contain a certain string in their name
    List<Book> findByNameContaining(String searchString);
}
