package com.lm.utils;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	private static SqlSessionFactory factory;
	
	static {
		ClassLoader classLoader = MyBatisUtils.class.getClassLoader();
		InputStream in = MyBatisUtils.class.getClassLoader().getResourceAsStream("conf/applicationContext.xml");
		factory = new SqlSessionFactoryBuilder().build(in);
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return factory;
	}
	
	/**
	 * 返回一个SqlSession对象(每次返回一个新的SqlSession对象)
	 * 若涉及多个表的操作，涉及事务的，要做到操作失败时回滚，那么建议自定义一个TransactionUtils的工具类
	 * 用ThreadLocal类来保存SqlSession类
	 * ，这样跨多个dao操作时，确保获取的都是同一SqlSession对象。然后在service层中捕获异常，再catch上用session的回滚。
	 * 
	 * @return
	 */
	public static SqlSession openSession() {
		return factory.openSession();
	}
}
