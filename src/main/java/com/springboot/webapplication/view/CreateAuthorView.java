package com.springboot.webapplication.view;

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
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.upload.Receiver;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.router.Route;
import org.atmosphere.interceptor.AtmosphereResourceStateRecovery;

import java.awt.*;

@Route("createAuthor")
public class CreateAuthorView extends  HorizontalLayout{


    VerticalLayout leftVerticalLayout = new VerticalLayout();
    VerticalLayout rightVerticalLayout = new VerticalLayout();
    H1 h1 = new H1("QWckjcjj");


    Image photo = new Image();

    TextArea lastNameArea = new TextArea("Enter your Last Name ");
    TextArea firstnameArea = new TextArea("Enter your first Name");


    DatePicker dateOfBirthPicker = new DatePicker( "Date of birth");

    Button addImage = new Button(new Icon(VaadinIcon.PLUS));

    private Receiver buffer1;
    Upload dropEnabledUpload = new Upload(buffer1);

    public CreateAuthorView(){

        add(h1);
        add(leftVerticalLayout) ;
        add(rightVerticalLayout);
        leftVerticalLayout.add(photo,addImage);

        rightVerticalLayout.add(lastNameArea,firstnameArea,dateOfBirthPicker);

        dropEnabledUpload.setDropAllowed(true);
        addImage.addThemeVariants(ButtonVariant.LUMO_ICON);
        addImage.getElement().setAttribute("aria-label", "Add item");


    }
}

