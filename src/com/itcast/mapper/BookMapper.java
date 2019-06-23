package com.itcast.mapper;

import java.util.ArrayList;
import com.itcast.pojo.Book;

public interface BookMapper {
	public ArrayList<Book> findAllBook();
	public void deleteBook(int id);
	public void insertBook(Book book);
	public Book findBook(int id);
	public void updateBook(Book book);
}
