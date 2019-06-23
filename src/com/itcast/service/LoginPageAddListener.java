package com.itcast.service;

import com.itcast.listener.LoginButton;
import com.itcast.listener.RegisterButton;
import com.itcast.view.LoginImpl;

//为登录界面添加事件处理,并返回添加了事件处理的登录界面
public class LoginPageAddListener {
	// 实例化一个登陆界面
	LoginImpl login = new LoginImpl();
	// 实例化一个登陆按钮的监听器
	LoginButton loginListener = new LoginButton();
	RegisterButton registerListener=new RegisterButton();
	public LoginPageAddListener() {
	};

	public LoginImpl getLoginPageImpl() {
		// 初始化登录事件监听器
		loginListener.setLogin(login);
		// 为登录界面添加登录按钮监听事件
		login.login.addActionListener(loginListener);
		// 初始化注册事件监听器
		loginListener.setLogin(login);
		// 为登录界面添加注册按钮监听事件
		login.register.addActionListener(registerListener);
		return login;
	}
}
