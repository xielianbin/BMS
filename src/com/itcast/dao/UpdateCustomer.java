package com.itcast.dao;

import org.apache.ibatis.session.SqlSession;

import com.itcast.mapper.CustomerMapper;
import com.itcast.pojo.Customer;
import com.itcast.utils.MyBatisSqlSessionUtil;

public class UpdateCustomer {
	public void updateCustomer(Customer customer){
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//通过SqlSession数据库事务类来获得BookMapper映射类
		CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);
		//通过映射类来获得书籍信息
		customerMapper.updateCustomer(customer);
		sqlSession.commit();
		sqlSession.close();
	}
}
