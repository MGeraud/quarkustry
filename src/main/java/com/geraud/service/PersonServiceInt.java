package com.geraud.service;

import com.geraud.model.Person;
import com.geraud.repositories.PersonRepository;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class PersonServiceInt implements PersonService{

    @Inject
    PersonRepository personRepository;

    @Override
    @Transactional
    public void createPersons() {
        Person geraud = new Person(1L, "Geraud");
        Person bob = new Person(2L, "Bobby");
        personRepository.persist(geraud,bob);

    }
}
