package com.yqx.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqx.dao.InfoContentDao;
import com.yqx.entity.InfoContent;
import com.yqx.service.InfoContentService;
import com.yqx.vo.InfoContentVO;

@Service("/infoContentService")
public class InfoContentServiceImpl extends BaseServiceImpl<InfoContent> implements InfoContentService{
	
	@Resource
	private InfoContentDao infoContentDao;
	
	@Override
	public List<InfoContentVO> queryViewByPage(int currentPage, int pageSize) {
		Map<String, Integer> map = new HashMap<>();
		map.put("start", currentPage * pageSize);
		map.put("end", (currentPage-1)*pageSize);
		return infoContentDao.queryViewByPage(map);
	}

}
