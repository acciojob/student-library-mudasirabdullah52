package com.example.library.studentlibrary.services;

import com.example.library.studentlibrary.repositories.AuthorRepository;
import com.example.library.studentlibrary.models.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository1;

    public void create(Author author){
        authorRepository1.save(author);
    }
}
