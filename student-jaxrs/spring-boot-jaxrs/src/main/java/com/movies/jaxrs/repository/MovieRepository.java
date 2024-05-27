package com.movies.jaxrs.repository;

import org.springframework.data.repository.CrudRepository;

import com.movies.jaxrs.entity.MovieEntity;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MovieRepository extends CrudRepository<MovieEntity, Integer> {

}
