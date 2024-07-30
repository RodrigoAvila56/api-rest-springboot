package com.developer.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.movies.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
