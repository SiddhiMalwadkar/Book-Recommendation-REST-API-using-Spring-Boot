package com.example.bookapi.controller;

import com.example.bookapi.model.Book;
import com.example.bookapi.repository.BookRepository;
import com.example.bookapi.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepo;

    @Autowired
    private RecommendationService recommendService;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }

    @GetMapping
    public List<Book> getBooks() {
        return bookRepo.findAll();
    }

    @GetMapping("/recommend/{userId}")
    public List<Book> recommend(@PathVariable Long userId) {
        return recommendService.getRecommendations(userId);
    }
}
