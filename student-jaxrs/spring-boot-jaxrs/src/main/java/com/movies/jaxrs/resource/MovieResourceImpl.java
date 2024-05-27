package com.movies.jaxrs.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.movies.jaxrs.entity.MovieEntity;
import com.movies.jaxrs.model.Movie;
import com.movies.jaxrs.service.MovieService;


@Controller
public class MovieResourceImpl implements MovieResource {

	@Autowired
	private MovieService movieService;

	@Override
	public Collection<MovieEntity> getAllMovies() {
		return movieService.getAllMovies();
	}

	@Override
	public Movie saveMovie(Movie movie) {
		return movieService.saveMovie(movie);
		
	}

	@Override
	public Movie getById(Integer id) {
		return movieService.getMovieById(id);
	}

	@Override
	public Movie updateById(Integer id, Movie movie) {
		Movie existingMovie = movieService.getMovieById(id);
		existingMovie.setMovie(movie.getMovie());
		existingMovie.setActor(movie.getActor());
		return movieService.saveMovie(existingMovie);
	}

	@Override
	public void deleteById(Integer id) {
		movieService.deleteById(id);
		
		
	}
		
}
