package com.itcast.pojo;

public class Book {
	private int id; // 图书编号
	private String name; // 图书名称
	private String author; // 作者
	private String authors; // 作者简介
	private String publish; // 出版社
	private String bookclass; // 所属类别
	private String time; // 出版时间
	private String isbn; // 图书ISBN编号
	private double price; // 图书单价
	private String content; // 图书简介

	public Book(int id, String name, String author, String authors, String publish, String bookclass, String time,
			String isbn, double price, String content) {

		this.id = id;
		this.name = name;
		this.author = author;
		this.authors = authors;
		this.publish = publish;
		this.bookclass = bookclass;
		this.time = time;
		this.isbn = isbn;
		this.price = price;
		this.content = content;
	}

	public Book() {
	};

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getBookclass() {
		return bookclass;
	}

	public void setBookclass(String bookclass) {
		this.bookclass = bookclass;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
