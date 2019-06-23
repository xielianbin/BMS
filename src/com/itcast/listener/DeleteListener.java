package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.itcast.dao.DeleteBook;
import com.itcast.service.SelectPageAddListener;
import com.itcast.view.Page;
/*
 * 窗口中的删除菜单中的事件监听处理器
 * 
 * */
public class DeleteListener extends SuperMenu implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//通过对话框获取用户要删除的图书编号
		String deleteID=JOptionPane.showInputDialog(null, "请输入要删除的图书编号");
		int id=Integer.parseInt(deleteID);
		 //通过对话框进行用户输入判断
		Object[] options = { "删 除", "取 消" };
		int i = JOptionPane.showOptionDialog(null, "确定要删除图书ID为"+deleteID+"的图书信息吗?", "操作确认", JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		switch(i) {
		case 0:
			page.setVisible(false);
			page.dispose();
			//通过dao层进行删除操作
			new DeleteBook().deleteBook(id);
			//初始化查询界面
			 Page updatePage=new SelectPageAddListener().getSelectPageImpl();
			 updatePage.setVisible(true);
			 break;
		case 1:break;
		}
	}

}
