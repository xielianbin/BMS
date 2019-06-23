package com.itcast.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/*
 * 图书管理系统查询界面
 * 
 * */
@SuppressWarnings("serial")
public class SelectPage extends Page {
	private JScrollPane scrollPane;
	private JTable bookTable;
	private JLabel searchLabel = new JLabel("图书检索:");
	@SuppressWarnings("rawtypes")
	public JComboBox comboBox = new JComboBox();
	public JTextField searchField = new JTextField();
	public JButton search = new JButton("搜  索");
	private JLabel bookOperation = new JLabel("图书操作:");
	public JButton insertButton = new JButton("添  加");
	public JButton updateButton = new JButton("修  改");
	public JButton deleteButton = new JButton("删  除");
	// 初始化图书操作子菜单的名称
	private String[] menuItemString = { "添  加", "修  改", "删  除" };

	// 初始化滚动面板与表
	public void tableInit(String[][] tableBody) {
		// 表头
		String[] tableHeader = { "图书编号", "图书名", "作者", "出版社", "所属分类", "发布时间", "图书ISBN", "价格", "类容简介" };

		bookTable = new JTable(tableBody, tableHeader);
		bookTable.setEnabled(false);
		scrollPane = new JScrollPane(bookTable);
		scrollPane.setBounds(1, 1, 893, 500);
		this.add(scrollPane);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void init(String[][] tableBody) {
		// TODO Auto-generated method stub
		// 调用父类初始化菜单
		super.menuInit(menuItemString);
		// 初始化滚动面板与表格区域
		tableInit(tableBody);
		int searchY = 510;
		int searchX = 20;
		searchLabel.setBounds(searchX + 10, searchY, 60, 25);
		this.add(searchLabel);
		// 初始化下拉列表
		comboBox.addItem("图书名");
		comboBox.addItem("作者");
		comboBox.addItem("出版社");
		comboBox.addItem("图书ISBN");
		comboBox.setBounds(searchX + 75, searchY, 90, 25);
		this.add(comboBox);
		searchField.setBounds(searchX + 170, searchY, 140, 25);
		this.add(searchField);
		search.setBounds(searchX + 330, searchY, 80, 25);
		this.add(search);
		bookOperation.setBounds(searchX + 500, searchY, 60, 25);
		this.add(bookOperation);
		insertButton.setBounds(searchX + 565, searchY, 80, 25);
		this.add(insertButton);
		updateButton.setBounds(searchX + 655, searchY, 80, 25);
		this.add(updateButton);
		deleteButton.setBounds(searchX + 745, searchY, 80, 25);
		this.add(deleteButton);
	}

	public SelectPage(String[][] tableBody) {
		this.setLayout(null);
		this.setTitle("图书管理系统-图书信息界面");
		init(tableBody);
		this.setResizable(false);
		this.setBounds(width, height, sizeX, sizeY);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
