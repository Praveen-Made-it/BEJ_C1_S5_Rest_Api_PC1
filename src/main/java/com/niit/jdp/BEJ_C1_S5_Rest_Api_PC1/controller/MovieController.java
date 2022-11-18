/*
 *Author Name:Praveen Kumar
 *Date: 18-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C1_S5_Rest_Api_PC1.controller;

import com.niit.jdp.BEJ_C1_S5_Rest_Api_PC1.domain.Movie;
import com.niit.jdp.BEJ_C1_S5_Rest_Api_PC1.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class MovieController {
    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/insertmovie")
    public ResponseEntity<?> saveFunction(@RequestBody Movie movieObj) {
        return new ResponseEntity<>(movieService.saveMovie(movieObj), HttpStatus.CREATED);
    }

    @GetMapping("/fetchallmovies")
    public ResponseEntity<?> fetchFunction() {
        return new ResponseEntity<>(movieService.fetchAllMovies(), HttpStatus.OK);
    }

    @DeleteMapping("/deletemoviebyid")
    public ResponseEntity<?> deleteFunction(@PathVariable int movieId) {
        movieService.deleteMovie(movieId);
        return new ResponseEntity<>(movieService, HttpStatus.OK);
    }
}
