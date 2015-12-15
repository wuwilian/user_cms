package com.lm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.lm.entity.UserEntity;
import com.lm.mapping.UserMapper;
import com.lm.utils.MyBatisUtils;

public class UserDao implements UserMapper {
	
	public UserEntity getUserEntityById(String userId) {
		SqlSession session = MyBatisUtils.openSession();
		UserEntity user = session.selectOne("getUserEntityById", userId);
		// 涉及insert、update、delete的DML，要手动的commit呢，注意close方法是不会监测有木有commit，幻想close方法去commit会让你死的很惨滴。
		session.commit();
		// session也是相当于缓冲池技术一样的，所以用完也要记得close哦。
		session.close();
		return user;
	}
	
	public List<UserEntity> getUserEntities() {
		SqlSession session = MyBatisUtils.openSession();
		List<UserEntity> userList = session.selectList("getUserEntities");
		session.commit();
		session.close();
		return userList;
		
	}
	
	public int insertUser(UserEntity userEntity) {
		SqlSession session = MyBatisUtils.openSession();
		int count = session.insert("insertUser", userEntity);
		session.commit();
		session.close();
		return count;
	}
	
	public UserEntity getUserByNameAndPassword(UserEntity user) {
		SqlSession session = MyBatisUtils.openSession();
		UserEntity loginUser = session.selectOne("getUserByNameAndPassword", user);
		session.commit();
		session.close();
		return loginUser;
	}
	
	public List<UserEntity> findUsersByUserName(String userName) {
		SqlSession session = MyBatisUtils.openSession();
		List<UserEntity> userList = session.selectList("findUsersByUserName", userName);
		return userList;
	}
	
}
