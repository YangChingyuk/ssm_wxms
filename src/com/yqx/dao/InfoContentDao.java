package com.yqx.dao;

import java.util.List;
import java.util.Map;

import com.yqx.entity.InfoContent;
import com.yqx.vo.InfoContentVO;

public interface InfoContentDao extends BaseDao<InfoContent>{
	
	public List<InfoContentVO> queryViewByPage(Map<String,Integer> map);
}
