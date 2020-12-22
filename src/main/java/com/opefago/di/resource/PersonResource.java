package com.opefago.di.resource;

import com.opefago.di.model.Person;
import com.opefago.di.services.RedisService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.util.List;
import java.util.Optional;

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {
    private final RedisService redisService;

    @Inject
    public PersonResource(final RedisService redisService){
        this.redisService = redisService;
    }

    @POST
    public Response add(@NotNull @Valid Person person) {
        redisService.addPerson(person);
        return Response.ok()
                .build();
    }

    @Path("/{name}")
    @GET
    public Person getPerson(@PathParam("name") String name){
        Optional<Person> person = redisService.getPerson(name);
        return person.orElseThrow(()->new WebApplicationException(Response.Status.NOT_FOUND));
    }

    @Path("/{name}")
    @DELETE
    public Person removePerson(@PathParam("name") String name){
        Optional<Person> person = redisService.deletePerson(name);
        return person.orElseThrow(()->new WebApplicationException(Response.Status.NOT_FOUND));
    }


    @Path("/{name}")
    @PUT
    public Response updatePerson(@PathParam("name") String name, @NotNull @Valid Person person){
        redisService.updatePerson(name, person);
        return Response.ok()
                .build();
    }
}
