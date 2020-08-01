package com.realhuseynov.customer.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.realhuseynov.customer.dal.entities.Customer;
import com.realhuseynov.customer.dal.repos.CustomerRepository;

@SpringBootTest
class CustomerdalApplicationTests {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("John");
		customer.setEmail("john@email.com");

		customerRepository.save(customer);
	}

	@Test
	public void testFindCustomerById() {
		Customer customer = customerRepository.findById(1).get();
		System.out.println(customer);
	}

	@Test
	public void testUpdateCustomer() {
		Customer customer = customerRepository.findById(1).get();
		customer.setEmail("john@gmail.com");

		customerRepository.save(customer);
	}

	@Test
	public void testDeleteCustomer() {
		Customer customer = new Customer();
		customer.setId(1);
		customerRepository.delete(customer);
	}

}
