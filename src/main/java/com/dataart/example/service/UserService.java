package com.dataart.example.service;

import com.dataart.example.dao.UserDao;
import com.dataart.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService
{
	@Autowired
	private UserDao dao;
	
	@Transactional(readOnly = true)
	public User find()
	{
		User user = dao.findOne(1);
		return user;
	}
	
	@Transactional
	public void save(User user)
	{
		dao.save(user);
	}
}
