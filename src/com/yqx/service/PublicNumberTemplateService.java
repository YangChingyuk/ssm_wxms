package com.yqx.service;

import java.util.List;

import com.yqx.entity.PublicNumberTemplate;
import com.yqx.vo.PublicNumberTemplateVO;

public interface PublicNumberTemplateService extends BaseService<PublicNumberTemplate>{
	
	public List<PublicNumberTemplateVO> queryViewByPage(int currentPage,int pageSize);
}
