package com.itcast.view;

import com.itcast.pojo.Book;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpdatePage t=new UpdatePage(new Book());
		t.setVisible(true);
/*		Object[] options = { "确定", "取消" };
		int i=JOptionPane.showOptionDialog(null, "确定要删除图书信息吗?", "删除确认", 
		JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
		null, options, options[0]);
		System.out.println(i);*/
	}

}
