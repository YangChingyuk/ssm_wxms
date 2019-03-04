package com.yqx.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqx.dao.TemplateDao;
import com.yqx.entity.Template;
import com.yqx.service.TemplateService;
import com.yqx.vo.TemplateVO;
@Service("templateService")
public class TemplateServiceImpl extends BaseServiceImpl<Template> implements TemplateService{
	
	@Resource
	private TemplateDao templateDao;
	
	@Override
	public List<TemplateVO> queryViewByPage(int currentPage, int pageSize) {
		Map<String, Integer> map = new HashMap<>();
		map.put("start", currentPage * pageSize);
		map.put("end", (currentPage-1)*pageSize);
		return templateDao.queryViewByPage(map);
	}

}
