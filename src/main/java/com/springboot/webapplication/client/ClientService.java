package com.springboot.webapplication.client;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
		
		try {
			client = new Client("mohh", "adbhg", "ggggu@gmail.com", 22, LocalDate.of(2000, Month.MARCH, 5));
			userDao.save(client);
		} catch (Exception ex) {
			return "Client not found";
		}
		return "Client is "+client.getNom();
	}
	
	public String delete(long id) {
		try {
			Client client = new Client(id);
			userDao.delete(client);
		} catch(Exception ex) {
			return "Error precess D failed";
		}
		return "Client succesfully deleted";
	}
	
	

	public String update(long id) {
		try {
		Client client = userDao.getById(id);
		client.setEmail("yourgmail@gmail.com");
		userDao.save(client);
		} catch (Exception ex) {
			return "Error process UP failed";
		}
		return "Client succesfully updated";
	}
}
