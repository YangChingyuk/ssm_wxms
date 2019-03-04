package com.yqx.service;

import java.util.List;

import com.yqx.entity.UserPublicNumber;
import com.yqx.vo.UserPublicNumberVO;

public interface UserPublicNumberService extends BaseService<UserPublicNumber>{
	
	public List<UserPublicNumberVO> queryViewByPage(int currentPage,int pageSize);
}
