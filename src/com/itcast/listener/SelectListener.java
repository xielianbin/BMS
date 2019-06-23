package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.itcast.service.SelectPageAddListener;
import com.itcast.view.Page;
/*
 * 窗口中的查询菜单中的事件监听处理器
 * 
 * */
public class SelectListener extends SuperMenu implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		page.setVisible(false);
		page.dispose();
		//初始化查询界面
		 Page updatePage=new SelectPageAddListener().getSelectPageImpl();
		 updatePage.setVisible(true);
	}

}
