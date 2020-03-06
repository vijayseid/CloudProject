package com.eureka.server.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eureka.server.model.CustomerDetails;
@Repository
public interface CustomerDetailsRepo extends JpaRepository<CustomerDetails, Long> {

}
