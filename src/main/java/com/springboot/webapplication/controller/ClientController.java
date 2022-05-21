package com.springboot.webapplication.controller;

import java.util.List;

import com.springboot.webapplication.entity.Client;
import com.springboot.webapplication.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/login")
public class ClientController {
	private final ClientService clientservice;
	
	
	@Autowired
	public ClientController (ClientService clientservice) {
		//this.clientservice = new ClientService();
		this.clientservice = clientservice;
	}
	
	@RequestMapping("/show")
	public List<Client> getClient(){
		return clientservice.getClient();
	}
	
	@RequestMapping("/create")
	public String create(Client client) {
		return clientservice.create(client);
	}
	
	@RequestMapping("/delete")
	public String delete(long id) {
		return clientservice.delete(id);
	}
	
	@RequestMapping("/update")
	public String update(Long id, String email) {
		return clientservice.update(id, email);
	}
	/*@RequestMapping("/login")
	public void affiche() {	
	}*/
	
}
