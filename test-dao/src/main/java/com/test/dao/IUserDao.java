package com.test.dao;

import com.test.entity.UserInfo;

public interface IUserDao {

	int deleteByPrimaryKey(Integer id);

	UserInfo selectByPrimaryKey(Integer id);

}