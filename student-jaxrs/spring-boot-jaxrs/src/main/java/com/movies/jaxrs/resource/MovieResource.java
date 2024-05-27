package com.movies.jaxrs.resource;

import java.util.Collection;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.movies.jaxrs.entity.MovieEntity;
import com.movies.jaxrs.model.Movie;

@Path("movies")
@Produces(MediaType.APPLICATION_JSON)
public interface MovieResource {
	
	@POST
	@Path("save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Movie saveMovie(Movie movie);
	@GET
	public Collection<MovieEntity> getAllMovies();
	@Path("{id}")
	@GET
	public Movie getById(@PathParam("id") Integer id);	
	
	@Path("{id}")
	@PUT
	public Movie updateById(@PathParam("id") Integer id, Movie movie);
	
	@Path("{id}")
	@DELETE
	public void deleteById(@PathParam("id") Integer id);

}
