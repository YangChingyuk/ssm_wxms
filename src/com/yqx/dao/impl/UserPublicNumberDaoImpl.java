package com.yqx.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yqx.dao.UserPublicNumberDao;
import com.yqx.entity.UserPublicNumber;
import com.yqx.vo.UserPublicNumberVO;
@Repository("userPublicNumberDao")
public class UserPublicNumberDaoImpl extends BaseDaoImpl<UserPublicNumber> implements UserPublicNumberDao{

	@Override
	public List<UserPublicNumberVO> queryViewByPage(Map<String, Integer> map) {
		return getSqlSession().selectList(UserPublicNumber.class.getSimpleName()+".queryViewByPage", map);
	}

}
