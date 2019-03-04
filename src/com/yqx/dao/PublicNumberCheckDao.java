package com.yqx.dao;

import java.util.List;
import java.util.Map;

import com.yqx.entity.PublicNumberCheck;
import com.yqx.vo.PublicNumberCheckVO;

public interface PublicNumberCheckDao extends BaseDao<PublicNumberCheck>{
	
	public List<PublicNumberCheckVO> queryViewByPage(Map<String,Integer> map);
}
