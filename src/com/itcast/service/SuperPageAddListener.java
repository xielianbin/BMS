package com.itcast.service;

import com.itcast.listener.ModifyCustomerName;
import com.itcast.listener.ModifyPassword;
import com.itcast.view.Page;

public abstract class SuperPageAddListener {
	public void initMenuListener(Page page) {
		//实例化查询界面的系统设置菜单的修改用户名与修改密码菜单
		ModifyCustomerName modifyCustomerName=new ModifyCustomerName();
		ModifyPassword modifyPassword=new ModifyPassword();
		
		//为查询界面的系统设置菜单添加事件处理器
		page.setMenuItem[0].addActionListener(modifyCustomerName);
		page.setMenuItem[1].addActionListener(modifyPassword);
	}
}
