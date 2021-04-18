package com.geraud.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Movies extends PanacheEntity { // avec extension génere l'id , les getters setters ...

    //les fields sont en public mais seront  changés de scope aveec hibernate Panache
    public String title;
    public String descritpion;

    public static List<Movies> findByTitle(String title){
        return Movies.find("title" , title).list();
    }
}
