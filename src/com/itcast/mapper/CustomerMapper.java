package com.itcast.mapper;

import java.util.ArrayList;
import com.itcast.pojo.Customer;

public interface CustomerMapper {
	public ArrayList<Customer> findAllCustomer();
	public void updateCustomer(Customer customer);
}
