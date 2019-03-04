package com.yqx.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yqx.dao.InfoContentDao;
import com.yqx.entity.InfoContent;
import com.yqx.vo.InfoContentVO;

@Repository("infoContentDao")
public class InfoContentDaoImpl extends BaseDaoImpl<InfoContent> implements InfoContentDao{

	@Override
	public List<InfoContentVO> queryViewByPage(Map<String, Integer> map) {
		return getSqlSession().selectList(InfoContent.class.getSimpleName()+".queryViewByPage", map);
	}

}
