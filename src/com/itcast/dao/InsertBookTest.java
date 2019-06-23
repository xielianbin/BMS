package com.itcast.dao;

import com.itcast.pojo.Book;

public class InsertBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// id,name,author,authors,publish,bookclass,time,isbn,price,content

		Book book = new Book();
		book.setId(1);
		book.setName("Java EE企业级应用开发实例教程");
		book.setAuthor("黑马程序员");
		book.setAuthors("黑马程序员12年IT教育经验,每10名学员就有7名来自老学员口碑推荐");
		book.setPublish("人民邮电出版社");
		book.setBookclass("JAVA");
		book.setTime("");
		book.setIsbn("9787302227854");
		book.setPrice(35.0);
		book.setContent(
				"本书内容主要包括Java EE框架和集成开发工具。主要类容包括Java EE框架核心结构、应用服务器、集成开发工具、"
				+ "Servlet组件编程、请求处理编程、响应处理编程、会话跟踪编程、ServletContext对象和应用、"
				+ "过滤器编程、监听器编程、JSP、EL和JSTL、JNDI服务基础和编程、JDBC服务编程、JavaMail编程和Java EEMVC模式架构应用");
		InsertBook insertBook=new InsertBook();
		insertBook.insertBook(book);
	}

}
