package com.springboot.webapplication.service;

import com.springboot.webapplication.repository.AuthorRepository;
import com.springboot.webapplication.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.*;
import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorDao;

    @Autowired
    public AuthorService(AuthorRepository authorDao){this.authorDao=authorDao;}

    public List<Author> getAuthor(){
        return authorDao.findAll();
    }


    public String createAuthor(Author author)
    {
        Author author1;
                try{
                    authorDao.save(author);

                }catch (Exception e){
                    return "Client not found";
                }
                return author.getId()+ author.getFullName()+" Has been created succefylly ";
    }

}
