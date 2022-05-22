package com.springboot.webapplication.view;

import com.springboot.webapplication.controller.AuthorController;
import com.springboot.webapplication.entity.Author;
import com.springboot.webapplication.service.AuthorService;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Receiver;
import com.vaadin.flow.component.upload.Upload;
import    com.vaadin.flow.component.textfield.*;
import com.vaadin.flow.router.Route;
import org.atmosphere.interceptor.AtmosphereResourceStateRecovery;

import java.awt.*;

@Route("createAuthor")
public class CreateAuthorView extends  VerticalLayout{





    H1 h1 = new H1("Create new account ");


    Image photo = new Image();

    TextField lastNameField= new TextField("Enter your Last Name ");
    TextField firstnameField = new TextField("Enter your first Name");

    EmailField emailField= new EmailField("enter your email");

    PasswordField passwordField = new PasswordField();


    Button submit = new Button("Create");



    private Receiver buffer1;
    Upload dropEnabledUpload = new Upload(buffer1);

    AuthorController authorController;

    public CreateAuthorView(    AuthorController authorController){
        this.authorController= authorController;

        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        setSizeFull();
        submit.addThemeVariants(ButtonVariant.LUMO_LARGE);


        submit.addClickListener(clickEvent ->
        {

     authorController.create(new Author(lastNameField.getValue(),
             firstnameField.getValue(),emailField.getValue(),passwordField.getValue()));


        });
        add(h1,lastNameField,firstnameField,emailField,passwordField,submit);






//        dropEnabledUpload.setDropAllowed(true);
//        addImage.addThemeVariants(ButtonVariant.LUMO_ICON);
//        addImage.getElement().setAttribute("aria-label", "Add item");


    }


}

