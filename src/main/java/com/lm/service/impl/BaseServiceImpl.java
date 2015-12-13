package com.lm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lm.entity.Base;
import com.lm.mapping.BaseMapper;
import com.lm.service.BaseService;

@Service("baseService")
public class BaseServiceImpl implements BaseService{

	private BaseMapper baseMapper;
	
	@Override
	public String addInfo(Base addInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Base> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Base findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Base addInfo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
