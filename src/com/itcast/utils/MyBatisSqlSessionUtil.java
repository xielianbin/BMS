package com.itcast.utils;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionUtil {
	
	public SqlSession getSqlSession() {
		String resource="mybatis-config.xml";
		SqlSession sqlSession=null;
		try {
			//1.读取配置文件
			InputStream inputStream=Resources.getResourceAsStream(resource);
			//2.通过配置文件获取SqlSessionFactory数据库事务工厂
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			//3.通过SqlSessionFactory数据库事务工厂获取SqlSession数据库事务
			sqlSession=sqlSessionFactory.openSession();
			System.out.println("数据库事务对象SqlSession加载成功...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sqlSession;
	}
}
