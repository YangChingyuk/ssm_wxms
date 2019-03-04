package com.yqx.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqx.dao.PublicNumberTemplateDao;
import com.yqx.entity.PublicNumberTemplate;
import com.yqx.service.PublicNumberTemplateService;
import com.yqx.vo.PublicNumberTemplateVO;

@Service("publicNumberTemplateService")
public class PublicNumberTemplateServiceImpl extends BaseServiceImpl<PublicNumberTemplate> implements PublicNumberTemplateService{
	
	@Resource
	private PublicNumberTemplateDao publicNumberTemplateDao;
	
	@Override
	public List<PublicNumberTemplateVO> queryViewByPage(int currentPage, int pageSize) {
		Map<String, Integer> map = new HashMap<>();
		map.put("start", currentPage * pageSize);
		map.put("end", (currentPage-1)*pageSize);
		return publicNumberTemplateDao.queryViewByPage(map);
	}

}
