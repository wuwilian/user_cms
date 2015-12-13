package com.lm.mapping;

import java.util.List;

import com.lm.entity.Base;

public interface BaseMapper {
	
	int deleteByPrimaryKey(String id);
	
	int insertSelective(Base record);
	
	Base selectByPrimaryKey(String id);
	
	int updateByPrimaryKeySelective(Base record);
	
	int updateByPrimaryKey(Base record);
	
	List<Base> getAll();
}
