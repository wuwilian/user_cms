package com.lm.service;

import java.util.List;

import com.lm.entity.Base;

public interface BaseService {
	
	String addInfo(Base addInfo);
	
	List<Base> getAll();
	
	String delete(String id);
	
	Base findById(String id);
	
	String update(Base addInfo);
}
