package com.yqx.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yqx.dao.PublicNumberCheckDao;
import com.yqx.entity.PublicNumberCheck;
import com.yqx.vo.PublicNumberCheckVO;
@Repository("publicNumberCheckDao")
public class PublicNumberCheckDaoImpl extends BaseDaoImpl<PublicNumberCheck> implements PublicNumberCheckDao{

	@Override
	public List<PublicNumberCheckVO> queryViewByPage(Map<String, Integer> map) {
		return getSqlSession().selectList(PublicNumberCheck.class.getSimpleName()+".queryViewByPage",map);
	}

}
