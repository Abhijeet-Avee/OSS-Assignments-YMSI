package com.test.q2.model.service;

import java.util.ArrayList;
import java.util.List;

import com.test.q2.model.exceptions.CustomerNotFoundException;
import com.test.q2.model.exceptions.DataAccessException;
import com.test.q2.model.persistence.Customer;
import com.test.q2.model.persistence.CustomerDao;
import com.test.q2.model.persistence.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao = null;
	
	public CustomerServiceImpl() {
		customerDao = new CustomerDaoImpl();
	}
	
	@Override
	public List<Customer> getAllCustomers() throws DataAccessException {
		List<Customer> customers = new ArrayList<>();
		customers = customerDao.getAllCustomers();
		return customers;
	}

	@Override
	public Customer getCustomerById(int id) throws CustomerNotFoundException, DataAccessException {
		Customer customer = null;
		customer = customerDao.getCustomerById(id);
		return customer;
	}

	@Override
	public void addCustomer(Customer customer) throws DataAccessException {
		customerDao.addCustomer(customer);		
	}

	@Override
	public void updateCustomer(Customer customer) throws DataAccessException {
		customerDao.updateCustomer(customer);
	}

	@Override
	public void removeCustomer(int id) throws DataAccessException {
		customerDao.removeCustomer(id);
	}
	
}
