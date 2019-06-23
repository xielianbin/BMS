package com.itcast.service;

import com.itcast.listener.DeleteListener;
import com.itcast.listener.InsertListener;
import com.itcast.listener.SelectListener;
import com.itcast.listener.UpdateButton;
import com.itcast.pojo.Book;
import com.itcast.view.UpdatePage;

public class UpdatePageAddListener extends SuperPageAddListener{
	// 实例化一个修改界面
	private UpdatePage updatePage;
	// 实例化一个修改界面的修改按钮的监听事件
	private UpdateButton updateButton = new UpdateButton();
	//咯咯
	//实例化一个修改界面的查询菜单的监听事件处理器
	private SelectListener selectListener=new SelectListener();
	//实例化一个修改界面的添加菜单的监听事件处理器
	private InsertListener insertListener=new InsertListener();
	//实例化一个修改界面的删除菜单的监听事件处理器
	private DeleteListener deleteListener=new DeleteListener();
	public UpdatePageAddListener() {
	};

	public UpdatePage getUpdatePageImpl(Book  book) {
		//初始化修改界面
		updatePage=new UpdatePage(book);
		super.initMenuListener(updatePage);
		//初始化添加界面的添加按钮
		updateButton.setPage(updatePage);
		// 为添加界面的添加按钮添加事件处理
		updatePage.updateButton.addActionListener(updateButton);
		
		// 初始化修改界面的查询菜单的事件处理监听器
		selectListener.setPage(updatePage);
		// 为修改界面的查询菜单添加事件处理器
		updatePage.operationMenuItem[0].addActionListener(selectListener);
		// 初始化修改界面的添加菜单的事件处理监听器
		insertListener.setPage(updatePage);
		// 为修改界面的修改菜单添加事件处理器
		updatePage.operationMenuItem[1].addActionListener(insertListener);
		// 初始化修改界面的删除菜单的事件处理监听器
		deleteListener.setPage(updatePage);
		// 为修改界面的删除菜单添加事件处理器
		updatePage.operationMenuItem[2].addActionListener(deleteListener);
		return updatePage;
	}
}
