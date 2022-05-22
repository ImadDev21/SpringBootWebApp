package com.springboot.webapplication.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@Route("login")

@PageTitle("Login | Vaadin CRM")
public class LoginView extends VerticalLayout /*implements BeforeEnterObserver */{

    private final LoginForm login = new LoginForm();

   // CreateAuthorView createAuthorView = new CreateAuthorView();




    public LoginView(){
        addClassName("login-view");
        setSizeFull();


        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        login.setAction("login");



        add(new H1("Vaadin CRM"), login);
    }

//    @Override
//    public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
//        // inform the user about an authentication error
////        if(beforeEnterEvent.getLocation()
////
//////
//////                .getQueryParameters()
////                .getParameters()
////                .containsKey("error")) {
////            login.setError(false);
////            beforeEnterEvent.forwardTo(CreateAuthorView.class);
////        }
//    }
}