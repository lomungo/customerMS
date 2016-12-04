package de.lomungo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.lomungo.entity.Customer;

@RestController
public class CustomerController {

	@RequestMapping(path="/customer/{customerId}", method=RequestMethod.GET)
	public Customer getCustomer(@PathVariable String customerId) {
		
		Customer cust = new Customer();
		cust.setFirstName("Ray");
		cust.setLastName("Charles");
		cust.setId(1);
		
		return cust;
	}
	
}
