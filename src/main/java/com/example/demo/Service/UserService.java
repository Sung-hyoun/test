package com.example.demo.Service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.UserDao;
import com.example.demo.Dto.UserDto;

@Service
public class UserService {
	@Autowired
    UserDao userDao;
	
	public UserDto matching(UserDto user,HttpSession session) {
		UserDto value = userDao.matchingUser(user);
		if(!(value.getUserId().equals(""))){
			session.setAttribute("user", value);
		}
		return value;
	}
	
    public List<UserDto> getAllUsers() {
        return userDao.getAllUsers();
    }
 
    public UserDto getUserByUserId(String userId) {
        return userDao.getUserByUserId(userId);
    }
 
    public UserDto registerUser(UserDto user) {
        return userDao.insertUser(user);
    }
 
    public void modifyUser(String userId, UserDto user) {
        userDao.updateUser(userId, user);
    }
 
    public void removeUser(String userId) {
        userDao.deleteUser(userId);
    }

	

}
