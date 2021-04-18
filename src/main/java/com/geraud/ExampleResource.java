package com.geraud;

import com.geraud.model.Movies;
import com.geraud.repositories.PersonRepository;

import com.geraud.service.PersonServiceInt;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/hello")
public class ExampleResource {

//    @Inject
//    PersonRepository personRepository;
//
//    @Inject
//    PersonServiceInt personServiceInt;
//
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
//
//        personServiceInt.createPersons();
//        String all = personRepository.findById(2L).toString();
//
//        return all;
//    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movies> movies() {
        return Movies.listAll() ;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response saveMovie(Movies movie){
        movie.persist();;
        return Response.status(Response.Status.CREATED).entity(movie).build();
    }

    //ajout de finder customs
    @GET
    @Path("/{episode}" )
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movies> movies(@PathParam("episode") String episode) {
        if (episode!= null){
            return Movies.findByTitle(episode) ;
        }
        return Movies.listAll() ;
    }


}