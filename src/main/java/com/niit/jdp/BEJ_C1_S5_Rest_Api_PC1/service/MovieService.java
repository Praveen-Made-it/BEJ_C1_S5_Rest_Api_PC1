package com.niit.jdp.BEJ_C1_S5_Rest_Api_PC1.service;

import com.niit.jdp.BEJ_C1_S5_Rest_Api_PC1.domain.Movie;

import java.util.List;

public interface MovieService {

    Movie saveMovie(Movie movie);

    boolean deleteMovie(int movieId);

    List<Movie> fetchAllMovies();
}
