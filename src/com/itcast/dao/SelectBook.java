package com.itcast.dao;

import org.apache.ibatis.session.SqlSession;
import com.itcast.mapper.BookMapper;
import com.itcast.pojo.Book;
import com.itcast.utils.MyBatisSqlSessionUtil;

public class SelectBook {
	public Book getBook(int id){
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//通过SqlSession数据库事务类来获得BookMapper映射类
		BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
		//通过映射类来获得书籍信息
		Book book=bookMapper.findBook(id);
		return book;
	}
}
