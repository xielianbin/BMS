package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.itcast.dao.InsertBook;
import com.itcast.pojo.Book;
import com.itcast.service.SelectPageAddListener;
import com.itcast.view.InsertPage;
import com.itcast.view.SelectPage;

public class InsertButton implements ActionListener {
	private Book book = new Book();
	// 初始化添加界面
	private InsertPage insertPage = new InsertPage();

	public void setInsertPage(InsertPage insertPage) {
		this.insertPage = insertPage;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		// 通过添加面板获取book对象的值
		book.setName(insertPage.insertPageField[0].getText());
		book.setAuthor(insertPage.insertPageField[1].getText());
		book.setTime(insertPage.insertPageField[2].getText());
		book.setPublish(insertPage.insertPageField[3].getText());
		String priceS = insertPage.insertPageField[4].getText();
		if (priceS != null)
			book.setPrice(Double.parseDouble(priceS));
		else
			book.setPrice(0.0);
		book.setIsbn(insertPage.insertPageField[5].getText());
		book.setBookclass((String) insertPage.bookclassComboBox.getSelectedItem());
		book.setContent(insertPage.contentArea.getText());
		book.setAuthors(insertPage.authorsArea.getText());
		System.out.println(book.getBookclass());
		// 调用dao层的添加对象的添加方法进行添加
		 new InsertBook().insertBook(book);
		 //通过对话框进行用户输入判断
		Object[] options = { "继续", "取消" };
		int i = JOptionPane.showOptionDialog(null, "添加成功，还要继续添加图书信息吗?", "操作确认", JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		switch (i) {
		case -1:
			break;
		case 0:
			//对组件内容进行清空重置
			for(int j=0;j<6;j++) {
				insertPage.insertPageField[j].setText(null);
			}
			insertPage.contentArea.setText(null);
			insertPage.authorsArea.setText(null);
			break;
		case 1:
			// 销毁添加界面
			insertPage.setVisible(false);
			insertPage.dispose();

			// 打开查找界面
			SelectPage selectPage = new SelectPageAddListener().getSelectPageImpl();
			selectPage.setVisible(true);
			break;
		}
	}

}
