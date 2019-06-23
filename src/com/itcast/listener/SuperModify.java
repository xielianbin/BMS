package com.itcast.listener;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.itcast.dao.FindCustomerList;
import com.itcast.pojo.Customer;

public abstract class SuperModify {
	public Customer getModifyCustomer() {
		String customerName = JOptionPane.showInputDialog(null, "--请输入您的用户名--");
		Customer customer = new Customer();
		ArrayList<Customer> customers = new FindCustomerList().findAllCustomer();

		boolean nameFlag = false;
		for (Customer c : customers) {
			if (customerName.equals(c.getName()))
				nameFlag = true;
		}
		if (nameFlag) {
			JOptionPane.showMessageDialog(null, "操作错误,用户名不存在");
			return null;
		}
		customer.setName(customerName);
		String customerPassword = JOptionPane.showInputDialog(null, "--请输入您的密码--");

		boolean passwordFlag = false;
		for (Customer c : customers) {
			if (customerPassword.equals(c.getPassword())) {
				passwordFlag = true;
				customer.setId(c.getId());
			}
		}
		if (passwordFlag) {
			JOptionPane.showMessageDialog(null, "操作错误,用户密码错误");
			return null;
		}
		customer.setPassword(customerPassword);
		/*
		 * //通过对话框进行用户输入判断 Object[] options = { "继  续", "取 消" }; int i =
		 * JOptionPane.showOptionDialog(null, "确定要删除图书ID为"+deleteID+"的图书信息吗?", "操作确认",
		 * JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options,
		 * options[0]); switch(i) {
		 */
		return customer;
	}

}
