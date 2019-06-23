package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.itcast.service.InsertPageAddListener;
import com.itcast.view.InsertPage;
/*
 * 窗口中的添加菜单中的事件监听处理器
 * 
 * */
public class InsertListener extends SuperMenu implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		page.setVisible(false);
		page.dispose();
		//初始化添加界面
		 InsertPage insertPage=new InsertPageAddListener().getInsertPageImpl();
		insertPage.setVisible(true);
	}

}
