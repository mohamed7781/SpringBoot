package com.movies.jaxrs.service;

import java.util.Collection;

import com.movies.jaxrs.entity.MovieEntity;
import com.movies.jaxrs.model.Movie;

public interface MovieService {
	
	Collection<MovieEntity> getAllMovies();
	
	Movie saveMovie(Movie movie);
	
	Movie getMovieById(Integer id);

	void deleteById(Integer id);

}
