package com.greatlearning.dao;

import java.util.List;

import com.greatlearning.model.Customer;

public interface CustomerDao {
	public List<Customer> findAll();
	
	public Customer findById(int id);
	
	public void save(Customer customer);
	
	public void deleteById(int id);
}
