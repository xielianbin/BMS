package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.itcast.dao.UpdateBook;
import com.itcast.pojo.Book;
import com.itcast.service.SelectPageAddListener;
import com.itcast.view.Page;
import com.itcast.view.UpdatePage;

public class UpdateButton implements ActionListener{
	//初始化单前页面
	private UpdatePage updatePage;
	public void setPage(UpdatePage updatePage) {
		this.updatePage=updatePage;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setId(updatePage.bookID);
		book.setName(updatePage.insertPageField[0].getText());
		book.setAuthor(updatePage.insertPageField[1].getText());
		book.setTime(updatePage.insertPageField[2].getText());
		book.setPublish(updatePage.insertPageField[3].getText());
		book.setPrice(Double.parseDouble(updatePage.insertPageField[4].getText()));
		book.setIsbn(updatePage.insertPageField[5].getText());
		book.setBookclass((String) updatePage.bookclassComboBox.getSelectedItem());
		book.setContent(updatePage.contentArea.getText());
		book.setAuthors(updatePage.authorsArea.getText());
		new UpdateBook().goUpdateBook(book);
		JOptionPane.showMessageDialog(null, "数据已修改");
		updatePage.setVisible(false);
		updatePage.dispose();
		//初始化查询界面
		 Page updatePage=new SelectPageAddListener().getSelectPageImpl();
		 updatePage.setVisible(true);
	}

}
