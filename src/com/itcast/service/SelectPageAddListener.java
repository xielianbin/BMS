package com.itcast.service;

import java.util.ArrayList;

import com.itcast.dao.SelectBookList;
import com.itcast.listener.DeleteListener;
import com.itcast.listener.InsertListener;
import com.itcast.listener.SearchButton;
import com.itcast.listener.UpdateListener;
import com.itcast.pojo.Book;
import com.itcast.view.SelectPage;

/*
 *  *为查询界面添加事件处理,并返回添加了事件处理的查询界面
 * 
*/public class SelectPageAddListener extends SuperPageAddListener{
	// 实例化一个查询界面的搜索按钮的监听器
	SearchButton searchButton = new SearchButton();
	// 实例化一个的添加按钮和添加菜单的监听事件
	InsertListener insertListener = new InsertListener();
	// 实例化一个修改按钮和修改菜单的监听事件
	UpdateListener updateListener = new UpdateListener();
	// 实例化一个查询界面的删除菜单的监听事件处理器
	private DeleteListener deleteListener = new DeleteListener();
	public SelectPageAddListener() {

	}
	public SelectPage getSelectPageImpl() {
		// 初始化查询页面的表的内容
		ArrayList<Book> books = new SelectBookList().getBookList();
		String[][] tableBody = new String[books.size()][9];
		for (int i = 0; i < books.size(); i++) {
			tableBody[i][0] = String.valueOf(books.get(i).getId());
			tableBody[i][1] = books.get(i).getName();
			tableBody[i][2] = books.get(i).getAuthor();
			tableBody[i][3] = books.get(i).getPublish();
			tableBody[i][4] = books.get(i).getBookclass();
			tableBody[i][5] = books.get(i).getTime();
			tableBody[i][6] = books.get(i).getIsbn();
			tableBody[i][7] = String.valueOf(books.get(i).getPrice());
			tableBody[i][8] = books.get(i).getContent();
		}
		// 实例化一个查询界面
		SelectPage selectPage = new SelectPage(tableBody);
		super.initMenuListener(selectPage);
		// 初始化查询界面的搜索按钮的事件监听器
		searchButton.setSelectPage(selectPage);
		// 给查询界面的搜索按钮添加事件监听器
		selectPage.search.addActionListener(searchButton);

		// 初始化查询界面的添加按钮
		insertListener.setPage(selectPage);
		// 为查询界面的添加按钮添加事件处理
		selectPage.insertButton.addActionListener(insertListener);
		// 为查询界面的添加菜单添加事件处理
		selectPage.operationMenuItem[0].addActionListener(insertListener);
		// 初始化查询界面的修改菜单
		updateListener.setPage(selectPage);
		// 为查询界面的添加按钮添加事件处理
		selectPage.updateButton.addActionListener(updateListener);
		// 为查询界面的修改菜单添加事件处理
		selectPage.operationMenuItem[1].addActionListener(updateListener);
		// 初始化查询界面的删除菜单的事件处理监听器
		deleteListener.setPage(selectPage);
		// 为查询界面的删除菜单添加事件处理器
		selectPage.operationMenuItem[2].addActionListener(deleteListener);
		// 为查询界面的删除按钮添加事件处理器
		selectPage.deleteButton.addActionListener(deleteListener);
		return selectPage;
	}
	public SelectPage getSelectPageImpl(String[][] tableBody) {
		// 实例化一个查询界面
		SelectPage selectPage = new SelectPage(tableBody);
		// 初始化查询界面的搜索按钮的事件监听器
		searchButton.setSelectPage(selectPage);
		// 给查询界面的搜索按钮添加事件监听器
		selectPage.search.addActionListener(searchButton);

		// 初始化查询界面的添加按钮
		insertListener.setPage(selectPage);
		// 为查询界面的添加按钮添加事件处理
		selectPage.insertButton.addActionListener(insertListener);
		// 为查询界面的添加菜单添加事件处理
		selectPage.operationMenuItem[0].addActionListener(insertListener);
		// 初始化查询界面的修改菜单
		updateListener.setPage(selectPage);
		// 为查询界面的添加按钮添加事件处理
		selectPage.updateButton.addActionListener(updateListener);
		// 为查询界面的修改菜单添加事件处理
		selectPage.operationMenuItem[1].addActionListener(updateListener);
		// 初始化查询界面的删除菜单的事件处理监听器
		deleteListener.setPage(selectPage);
		// 为查询界面的删除菜单添加事件处理器
		selectPage.operationMenuItem[2].addActionListener(deleteListener);
		// 为查询界面的删除按钮添加事件处理器
		selectPage.deleteButton.addActionListener(deleteListener);
		return selectPage;
	}
}
