package com.eureka.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eureka.server.model.Details;

@Repository
public interface DetailsRepo extends JpaRepository<Details, Long>{

}
