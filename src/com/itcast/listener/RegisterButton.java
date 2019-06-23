package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.itcast.service.LoginPageAddListener;
import com.itcast.view.LoginImpl;

public class RegisterButton implements ActionListener {
	private LoginImpl login = new LoginImpl();

	public void setLogin(LoginImpl login) {
		this.login = login;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "权限不足,请联系 系统管理员 进行用户注册");
		login.setVisible(false);
		login.dispose();
		// 初始化登录界面
		LoginImpl login = new LoginPageAddListener().getLoginPageImpl();
		// 显示登陆界面
		login.setVisible(true);
	}

}
