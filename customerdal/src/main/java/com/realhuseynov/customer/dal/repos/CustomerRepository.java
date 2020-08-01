package com.realhuseynov.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.realhuseynov.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
