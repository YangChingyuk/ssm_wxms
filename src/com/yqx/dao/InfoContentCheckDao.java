package com.yqx.dao;

import java.util.List;
import java.util.Map;

import com.yqx.entity.InfoContentCheck;
import com.yqx.vo.InfoContentCheckVO;

public interface InfoContentCheckDao extends BaseDao<InfoContentCheck>{
	
	public List<InfoContentCheckVO> queryViewByPage(Map<String,Integer> map);
}
