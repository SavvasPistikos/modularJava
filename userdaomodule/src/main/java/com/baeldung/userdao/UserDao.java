package com.baeldung.userdao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.baeldung.dao.Dao;
import com.baeldung.entity.User;

public class UserDao implements Dao<User> {

	private final Map<Integer, User> users;

	public UserDao(Map<Integer, User> users) {
		this.users = users;
	}

	// standard constructor

	@Override
	public Optional<User> findById(int id) {
		return Optional.ofNullable(users.get(id));
	}

	@Override
	public List<User> findAll() {
		return new ArrayList<User>(users.values());
	}

}
