package com.baeldung.mainappmodule;

import java.util.HashMap;
import java.util.Map;

import com.baeldung.dao.Dao;
import com.baeldung.entity.User;
import com.baeldung.userdao.UserDao;

public class Application {

	public static void main(String[] args) {
		Map<Integer, User> users = new HashMap<>();
		users.put(1, new User("Julie"));
		users.put(2, new User("David"));
		Dao userDao = new UserDao(users);
		userDao.findAll().forEach(System.out::println);
	}
}
