package com.itcast.service;

import java.util.ArrayList;

import com.itcast.dao.FindCustomerList;
import com.itcast.pojo.Customer;

public class CheckCustomer {
	public boolean checkCustomer(String name, String password) {
		//nameFlag用来判断用户名是否存在
		boolean nameFlag = false;
		ArrayList<Customer> customers = new FindCustomerList().findAllCustomer();
		for (Customer c : customers) {
			if (name.equals(c.getName()))
				nameFlag = true;
			if (password.equals(c.getPassword())) {
				if (nameFlag)
					return true;
			}
		}
		return false;
	}
}
