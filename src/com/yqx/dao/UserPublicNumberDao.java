package com.yqx.dao;

import java.util.List;
import java.util.Map;

import com.yqx.entity.UserPublicNumber;
import com.yqx.vo.UserPublicNumberVO;

public interface UserPublicNumberDao extends BaseDao<UserPublicNumber>{
	
	public List<UserPublicNumberVO> queryViewByPage(Map<String,Integer> map);
	
}
