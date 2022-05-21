package com.springboot.webapplication.repository;


import com.springboot.webapplication.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<Client, Long>{
	
}
