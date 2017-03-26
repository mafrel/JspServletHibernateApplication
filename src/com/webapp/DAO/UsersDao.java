package com.webapp.DAO;

import java.util.List;

import com.webapp.entities.Users;

public interface UsersDao {
	boolean registerUser(Users u);
	boolean loginUser(String userName, String password);
	
	List<Users> getAllUsers();
	
	boolean updateUser(Users u, int id);
	boolean deleteUser(int id);
}
