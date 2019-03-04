package com.yqx.service;

import java.util.List;

import com.yqx.entity.Template;
import com.yqx.vo.TemplateVO;

public interface TemplateService extends BaseService<Template>{
	
	public List<TemplateVO> queryViewByPage(int currentPage,int pageSize);
}
