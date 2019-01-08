package com.haoli.personalSite.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.haoli.personalSite.domain.User;

@Mapper
public interface UserDao {

	User queryUser(Map<String, Object> params);

	Integer add(User user);

}
