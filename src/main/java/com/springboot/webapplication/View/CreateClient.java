package com.springboot.webapplication.View;

import com.springboot.webapplication.client.Client;
import com.springboot.webapplication.client.ClientService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.RolesAllowed;


@Route("createAccount")
@PageTitle("New Account Creation")
@RolesAllowed("ADMIN")
public class CreateClient extends VerticalLayout {

    public CreateClient(){
        add(new H3("create your account"));
    }

}
