package com.springboot.webapplication.view;

import com.springboot.webapplication.entity.Author;
import com.springboot.webapplication.service.AuthorService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.List;

@Route("/authors")
public class ListAuthor extends VerticalLayout {

    H1 h1 = new H1(" Liste of all Authors");

    Grid<Author> grid = new Grid<>(Author.class) ;

    private AuthorService authorService;


    public ListAuthor( AuthorService authorService){

            add(h1);
            h1.setSizeFull();
            this.authorService=authorService;
            addClassName("list-author-view");
            setSizeFull();
            configreGride();
            add(grid);
            updateListe();
    }

    private void updateListe() {
    }

    private void configreGride() {
        
    }


}
