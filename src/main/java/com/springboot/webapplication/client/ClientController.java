package com.springboot.webapplication.client;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
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
	public String delete() {
		return clientservice.delete();
	}
	
	@RequestMapping("/update")
	public String update() {
		return clientservice.update();
	}
	
	/*@RequestMapping(value = "/home")
	public void affiche(Model model) {	
	}*/
	
}
