package com.geraud.repositories;

import com.geraud.model.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person> {
    public List<Person> findall(){
        return findall();
    }

}
