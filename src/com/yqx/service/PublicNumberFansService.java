package com.yqx.service;

import java.util.List;

import com.yqx.entity.PublicNumberFans;
import com.yqx.vo.PublicNumberFansVO;

public interface PublicNumberFansService extends BaseService<PublicNumberFans>{
	
	public List<PublicNumberFansVO> queryViewByPage(int currentPage,int pageSize);
}
