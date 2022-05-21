package com.springboot.webapplication.repository;

import com.springboot.webapplication.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long>
{

}
