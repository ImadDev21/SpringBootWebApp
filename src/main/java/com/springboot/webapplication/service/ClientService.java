package com.springboot.webapplication.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.springboot.webapplication.repository.UserDao;
import com.springboot.webapplication.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Component
@Service
public class ClientService{
	private final UserDao userDao;
	
	@Autowired
	public ClientService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public List<Client> getClient(){
		return userDao.findAll();
	}
	
	public String create(Client client) {

		Client c1;
		try {
			// we will add an email control later (email must be unique)
			c1 = new Client("Mohamed", "Fathi", "fathi@gmail.com",
					22, LocalDate.of(2000, Month.MARCH, 5));
			userDao.save(c1);
		} catch (Exception ex) {
			return "Client not found";
		}
		return c1.getNom() + " account is succesfully created";
	}
	
	public String delete(Long id) {
		try {
			// if we delete a client it must be redirected to home page (like logout)--add it later
			Client client = userDao.getById(id);
			userDao.delete(client);
		} catch(Exception ex) {
			return "Error precess D failed";
		}
		return "Client succesfully deleted";
	}		

	public String update(Long id, String email) {
		try {
		Client client = userDao.getById(id);
		// if the new email is not match the old one then we update it else we have an ERROR
		if (!(client.getEmail().equals(email)) ) {
			client.setEmail(email);
			userDao.save(client);
		}
		else return "New email matches the old one";
		} catch (Exception ex) {
			return "Error process UP failed";
		}
		return "Client succesfully updated";
	}
}
