package com.itast.controller;

import com.itcast.service.LoginPageAddListener;
import com.itcast.view.LoginImpl;

public class BMSControllerImpl implements BMSController{

	@Override
	public void controller() {
		// TODO Auto-generated method stub
		//初始化登录界面
		LoginImpl login=new LoginPageAddListener().getLoginPageImpl();
		//显示登陆界面
		login.setVisible(true);
	}
	public BMSControllerImpl() {
		controller();
	}
}
