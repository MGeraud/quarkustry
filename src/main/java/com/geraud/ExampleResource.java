package com.geraud;

import com.geraud.repositories.PersonRepository;

import com.geraud.service.PersonServiceInt;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class ExampleResource {

    @Inject
    PersonRepository personRepository;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        String all = personRepository.findById(2L).toString();

        return all;
    }
}