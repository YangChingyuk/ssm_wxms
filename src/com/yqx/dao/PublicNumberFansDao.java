package com.yqx.dao;

import java.util.List;
import java.util.Map;

import com.yqx.entity.PublicNumberFans;
import com.yqx.vo.PublicNumberFansVO;

public interface PublicNumberFansDao extends BaseDao<PublicNumberFans>{
	
	public List<PublicNumberFansVO> queryViewByPage(Map<String,Integer> map);
}
