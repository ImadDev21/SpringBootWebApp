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
                try{ author1= new Author( "benahmed",
                        "mohamed",
                        LocalDate.of(2000, Month.MARCH, 5),
                        "iam a new author i love writing about anything",
                        "email.me@gmail.com",
                        "0525288728"
                );

                    authorDao.save(author1);

                }catch (Exception e){
                    return "Client not found";
                }
                return author1.getId()+ author.getFullName()+" Has been created succefylly ";
    }

}
