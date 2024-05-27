package com.movies.jaxrs.service;

import java.util.Collection;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.jaxrs.model.Movie;
import com.movies.jaxrs.entity.MovieEntity;
import com.movies.jaxrs.repository.MovieRepository;

import java.util.Optional;


@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository repository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public Collection<MovieEntity> getAllMovies() {
		return (Collection<MovieEntity>) repository.findAll();
	}

	@Override
	public Movie saveMovie(Movie movie) {
		MovieEntity movieEntity = modelMapper.map(movie, MovieEntity.class);
		repository.save(movieEntity);
		return modelMapper.map(movieEntity, Movie.class);
	}

	@Override
	public Movie getMovieById(Integer id) {
		Optional<MovieEntity> movies = repository.findById(id);
		return modelMapper.map(movies.get(), Movie.class);
	}

	@Override
	public void deleteById(Integer id) {
		repository.deleteById(id);
		
	}
	
}
