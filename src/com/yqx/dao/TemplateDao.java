package com.yqx.dao;

import java.util.List;
import java.util.Map;

import com.yqx.entity.Template;
import com.yqx.vo.TemplateVO;

public interface TemplateDao extends BaseDao<Template>{
	
	public List<TemplateVO> queryViewByPage(Map<String,Integer> map);
}
