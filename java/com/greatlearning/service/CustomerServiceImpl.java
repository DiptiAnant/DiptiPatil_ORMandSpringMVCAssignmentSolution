package com.greatlearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.dao.CustomerDao;
import com.greatlearning.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDaoImpl;
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerDaoImpl.findAll();
	}
	
	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return customerDaoImpl.findById(id);
	}
	
	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		customerDaoImpl.save(customer);
	}
	
	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		customerDaoImpl.deleteById(id);
	}

	

}
