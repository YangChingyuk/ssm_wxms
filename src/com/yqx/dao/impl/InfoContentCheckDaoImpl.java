package com.yqx.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yqx.dao.InfoContentCheckDao;
import com.yqx.entity.InfoContentCheck;
import com.yqx.vo.InfoContentCheckVO;

@Repository("infoContentCheckDao")
public class InfoContentCheckDaoImpl extends BaseDaoImpl<InfoContentCheck> implements InfoContentCheckDao{

	@Override
	public List<InfoContentCheckVO> queryViewByPage(Map<String, Integer> map) {
		return getSqlSession().selectList(InfoContentCheck.class.getSimpleName()+".queryViewByPage", map);
	}

}
