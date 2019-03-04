package com.yqx.service;

import java.util.List;

import com.yqx.entity.InfoContent;
import com.yqx.vo.InfoContentVO;

public interface InfoContentService extends BaseService<InfoContent>{
	
	public List<InfoContentVO> queryViewByPage(int currentPage,int pageSize);
}
