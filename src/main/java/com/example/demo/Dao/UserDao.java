package com.example.demo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.Dto.UserDto;

@Repository
public class UserDao {
	
	public static List<UserDto> users;
	 
    //실제 데이터는 DB에서 가져오는게 맞으나 .... 아직 DB가 없으니 임시로 세팅해놓음
    static {
        users = new ArrayList<>();
        users.add(new UserDto(1,"testName1","testId1", "1234"));
        users.add(new UserDto(2,"testName2","testId2", "1235"));
        users.add(new UserDto(3,"testName3","testId3", "1234"));
        users.add(new UserDto(4,"testName4","testId4", "1234"));
        users.add(new UserDto(5,"testName5","testId5", "1234"));
    }
 
    // Select all user.
    public List<UserDto> getAllUsers() {
        return users;
    }
 
    // Select one user by userId
    public UserDto getUserByUserId(String userId) {
        return users
                .stream()
                .filter(user -> user.getUserId().equals(userId))
                .findAny()
                .orElse(new UserDto(-1, "", "", ""));
    }
 
    // Insert User
    public UserDto insertUser(UserDto user) {
        users.add(user);
 
        return user;
    }
 
    // Modify User
    public void updateUser(String userId,UserDto user) {
        users.stream()
                .filter(curUser -> curUser.getUserId().equals(userId))
                .findAny()
                .orElse(new UserDto(-1, "", "", ""))
                .setUserName(user.getUserName());
    }
 
    // Delete User
    public void deleteUser(String userId) {
        users.removeIf(user -> user.getUserId().equals(userId));
    }
    
    //회원 매칭기능
    public UserDto matchingUser(UserDto user) {
    	return users
                .stream()
                .filter((users) -> users.getUserId().equals(user.getUserId()) &&
                				 users.getUserPassword().equals(user.getUserPassword()))
                .findAny()
                .orElse(new UserDto(-1, "", "", ""));
    }
}
