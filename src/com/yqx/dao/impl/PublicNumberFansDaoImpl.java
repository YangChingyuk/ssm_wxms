package com.yqx.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yqx.dao.PublicNumberFansDao;
import com.yqx.entity.PublicNumberFans;
import com.yqx.vo.PublicNumberFansVO;

@Repository("publicNumberFansDao")
public class PublicNumberFansDaoImpl extends BaseDaoImpl<PublicNumberFans> implements PublicNumberFansDao{

	@Override
	public List<PublicNumberFansVO> queryViewByPage(Map<String, Integer> map) {
		return getSqlSession().selectList(PublicNumberFans.class.getSimpleName()+".queryViewByPage", map);
	}

}
