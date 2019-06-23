package com.itcast.dao;

import com.itcast.mapper.BookMapper;
import com.itcast.pojo.Book;
import org.apache.ibatis.session.SqlSession;
import com.itcast.utils.MyBatisSqlSessionUtil;
public class InsertBook {
	public void insertBook(Book book) {
		//获取SqlSession数据库事务类
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//通过SqlSession数据库事务类来获得BookMapper持久化类的映射类
		BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
		//执行数据库插入操作
		bookMapper.insertBook(book);
		//提交数据库事务类SqlSession
		sqlSession.commit();
		//关闭数据库事务类SqlSession
		sqlSession.close();
		System.out.println("--插入成功!--");
	}
}
