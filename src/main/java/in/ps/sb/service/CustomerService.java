package in.ps.sb.service;

import java.util.List;

import in.ps.sb.entity.Customer;

public interface CustomerService {
	
	void saveCustomer(Customer customer);
	List<Customer> getAllCustomers();
	void deleteCustomer(int customerId);
	Customer getCustomerById(int customerId);

}