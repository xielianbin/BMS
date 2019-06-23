package com.itcast.dao;

import com.itcast.pojo.Book;

public class Test {

	public static void main(String[] args) {
		Book book = new SelectBook().getBook(1);
		System.out.println(book.getName());
	}
}
