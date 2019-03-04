package com.yqx.service;

import java.util.List;

import com.yqx.entity.PublicNumberCheck;
import com.yqx.vo.PublicNumberCheckVO;

public interface PublicNumberCheckService extends BaseService<PublicNumberCheck>{
	
	public List<PublicNumberCheckVO> queryViewByPage(int currentPage,int pageSize);
}
