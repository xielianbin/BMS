package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.itcast.dao.SelectBook;
import com.itcast.service.UpdatePageAddListener;
import com.itcast.view.Page;

public class UpdateListener extends SuperMenu implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int id = 0;
		String updateID = JOptionPane.showInputDialog(null, "请 输 入 需 要 修 改 的 图 书 信 息 I D");
		id = Integer.valueOf(updateID);
		page.setVisible(false);
		page.dispose();
		// 初始化修改界面,通过dao层的selectBook类查询获取单个图书信息并传入
		Page updatePage = new UpdatePageAddListener().getUpdatePageImpl(new SelectBook().getBook(id));
		updatePage.setVisible(true);

	}

}
