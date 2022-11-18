package com.niit.jdp.BEJ_C1_S5_Rest_Api_PC1.repository;

import com.niit.jdp.BEJ_C1_S5_Rest_Api_PC1.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
