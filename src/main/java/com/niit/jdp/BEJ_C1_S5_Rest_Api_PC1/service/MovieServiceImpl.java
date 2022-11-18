/*
 *Author Name:Praveen Kumar
 *Date: 18-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C1_S5_Rest_Api_PC1.service;

import com.niit.jdp.BEJ_C1_S5_Rest_Api_PC1.domain.Movie;
import com.niit.jdp.BEJ_C1_S5_Rest_Api_PC1.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public boolean deleteMovie(int movieId) {
        movieRepository.deleteById(movieId);
        return true;
    }

    @Override
    public List<Movie> fetchAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }
}
