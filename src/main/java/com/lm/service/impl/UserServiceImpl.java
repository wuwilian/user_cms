package com.lm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.entity.UserEntity;
import com.lm.mapping.UserMapper;
import com.lm.service.UserService;

@Service("userServiceImpl")

public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userDao;

	public UserMapper getUserDao() {
		return userDao;
	}

	public void setUserDao(UserMapper userDao) {
		this.userDao = userDao;
	}

	@Override
	public UserEntity getUserEntityById(String userId) {
		return this.userDao.getUserEntityById(userId);
	}

	@Override
	public List<UserEntity> getUserEntities() {
		return this.userDao.getUserEntities();
	}

	@Override
	public UserEntity insertUserEntity(UserEntity userEntity) {
		this.userDao.insertUser(userEntity);

		return getUserEntityById(userEntity.getUserId());
	}

}
