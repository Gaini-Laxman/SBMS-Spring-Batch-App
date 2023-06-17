package com.klinnovations.repo;



import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klinnovations.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

}
