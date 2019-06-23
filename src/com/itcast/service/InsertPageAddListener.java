package com.itcast.service;

import com.itcast.listener.DeleteListener;
import com.itcast.listener.InsertButton;
import com.itcast.listener.SelectListener;
import com.itcast.listener.UpdateListener;
import com.itcast.view.InsertPage;

/*
 * 为添加界面添加事件处理,并返回添加了事件处理的添加界面
 **/
public class InsertPageAddListener extends SuperPageAddListener{
	// 实例化一个添加界面
	private InsertPage insertPage = new InsertPage();
	// 实例化一个添加界面的添加按钮的监听事件处理器
	private InsertButton insertButton = new InsertButton();
	//实例化一个添加界面的查询菜单的监听事件处理器
	private SelectListener selectListener=new SelectListener();
	//实例化一个添加界面的修改菜单的监听事件处理器
	private UpdateListener updateListener=new UpdateListener();
	//实例化一个添加界面的删除菜单的监听事件处理器
	private DeleteListener deleteListener=new DeleteListener();
	public InsertPageAddListener() {
	};

	public InsertPage getInsertPageImpl() {
		super.initMenuListener(insertPage);
		// 初始化添加界面的添加按钮的添加事件处理监听器
		insertButton.setInsertPage(insertPage);
		// 为添加界面的添加按钮添加事件处理
		insertPage.insertButton.addActionListener(insertButton);
		// 初始化添加界面的查询菜单的事件处理监听器
		selectListener.setPage(insertPage);
		// 为添加界面的查询菜单添加事件处理器
		insertPage.operationMenuItem[0].addActionListener(selectListener);
		// 初始化添加界面的修改菜单的事件处理监听器
		updateListener.setPage(insertPage);
		// 为添加界面的修改菜单添加事件处理器
		insertPage.operationMenuItem[1].addActionListener(updateListener);
		// 初始化添加界面的删除菜单的事件处理监听器
		deleteListener.setPage(insertPage);
		// 为添加界面的删除菜单添加事件处理器
		insertPage.operationMenuItem[2].addActionListener(deleteListener);
		return insertPage;
	}
}
