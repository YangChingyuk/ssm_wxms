package com.yqx.service;

import java.util.List;

import com.yqx.entity.InfoContentCheck;
import com.yqx.vo.InfoContentCheckVO;

public interface InfoContentCheckService extends BaseService<InfoContentCheck>{

	public List<InfoContentCheckVO> queryViewByPage(int currentPage,int pageSize);
}
