package com.itcast.dao;

import java.util.ArrayList;
import org.apache.ibatis.session.SqlSession;
import com.itcast.mapper.CustomerMapper;
import com.itcast.pojo.Customer;
import com.itcast.utils.MyBatisSqlSessionUtil;

public class FindCustomerList {
	public ArrayList<Customer> findAllCustomer(){
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//通过SqlSession数据库事务类来获得BookMapper映射类
		CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);
		//通过映射类来获得书籍信息
		ArrayList<Customer> customer=customerMapper.findAllCustomer();
		return customer;
	}
}
