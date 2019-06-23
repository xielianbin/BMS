package com.itcast.dao;

import org.apache.ibatis.session.SqlSession;

import com.itcast.mapper.BookMapper;
import com.itcast.utils.MyBatisSqlSessionUtil;

public class DeleteBook {
	public void deleteBook(int id) {
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
		bookMapper.deleteBook(id);
		sqlSession.commit();
		sqlSession.close();
		System.out.println("É¾³ý³É¹¦!");
	}
}
