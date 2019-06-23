package com.itcast.listener;
/*对用户登录进行校验*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.itcast.service.CheckCustomer;
import com.itcast.service.SelectPageAddListener;
import com.itcast.view.LoginImpl;
import com.itcast.view.SelectPage;

public class LoginButton implements ActionListener {

	private LoginImpl login = new LoginImpl();

	public void setLogin(LoginImpl login) {
		this.login = login;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = login.nameField.getText();
		@SuppressWarnings("deprecation")
		String password = login.passwordField.getText();
		if(new CheckCustomer().checkCustomer(name, password)) {
			login.setVisible(false);
			login.dispose();
			SelectPage selectPage = new SelectPageAddListener().getSelectPageImpl();
			selectPage.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(null, "--输入的密码或用户名为空或输入的密码或用户名错误!--");
		}
	}

}