package com.springboot.webapplication.controller;


import com.springboot.webapplication.entity.Author;
import com.springboot.webapplication.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping(value = "/login")
public class AuthorController {

    private final AuthorService authorService;


        @Autowired
        public AuthorController(AuthorService authorService) {

            this.authorService =  authorService;
        }

        @RequestMapping("/showAuthor")
        public List<Author> getAuthors(){return authorService.getAuthor();}

        @RequestMapping("/createAuthor")
        public String create(Author author) {
            return authorService.createAuthor(author);
        }



}
