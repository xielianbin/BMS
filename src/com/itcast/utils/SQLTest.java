package com.itcast.utils;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.itcast.mapper.BookMapper;
import com.itcast.pojo.Book;
public class SQLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
        BookMapper userMapper = sqlSession.getMapper(BookMapper.class);
        ArrayList<Book> books =  userMapper.findAllBook();
		System.out.println("º”‘ÿSqlSession");
	//	List<Customer> customer=sqlSession.selectList("com.itcast.mapper.CustomerMapper.findAllCustomer");
		for(Book b:books) {
		System.out.println(b.getName());}
	}

}
