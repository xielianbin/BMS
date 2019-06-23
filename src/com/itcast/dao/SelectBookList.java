package com.itcast.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.itcast.mapper.BookMapper;
import com.itcast.pojo.Book;
import com.itcast.utils.MyBatisSqlSessionUtil;
public class SelectBookList {
	public ArrayList<Book> getBookList(){
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//通过SqlSession数据库事务类来获得BookMapper映射类
		BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
		//通过映射类来获得书籍信息
		ArrayList<Book> books=bookMapper.findAllBook();
		return books;
	}
}
