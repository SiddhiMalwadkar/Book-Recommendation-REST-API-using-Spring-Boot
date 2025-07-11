package com.example.bookapi.service;

import com.example.bookapi.model.Book;
import com.example.bookapi.model.User;
import com.example.bookapi.repository.BookRepository;
import com.example.bookapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private BookRepository bookRepo;

    public List<Book> getRecommendations(Long userId) {
        User user = userRepo.findById(userId).orElse(null);
        if (user == null || user.getFavoriteGenres().isEmpty()) {
            return List.of();
        }
        return bookRepo.findByGenreIn(user.getFavoriteGenres());
    }
}
