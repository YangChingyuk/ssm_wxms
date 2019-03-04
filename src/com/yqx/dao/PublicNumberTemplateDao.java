package com.yqx.dao;

import java.util.List;
import java.util.Map;

import com.yqx.entity.PublicNumberTemplate;
import com.yqx.vo.PublicNumberTemplateVO;

public interface PublicNumberTemplateDao extends BaseDao<PublicNumberTemplate>{

	public List<PublicNumberTemplateVO> queryViewByPage(Map<String,Integer> map);
}
