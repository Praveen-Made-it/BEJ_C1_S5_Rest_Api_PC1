/*
 *Author Name:Praveen Kumar
 *Date: 18-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C1_S5_Rest_Api_PC1.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    private int movieId;
    private String movieName;
    private String actorName;
    private String movieDirector;

    public Movie() {
    }

    public Movie(int movieId, String movieName, String actorName, String movieDirector) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.actorName = actorName;
        this.movieDirector = movieDirector;
    }


}
