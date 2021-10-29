package com.example.demo.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.AccessTokenDto;
import com.example.demo.Dto.UserDto;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	static HttpSession session;
	private final static String PROFILE_API_URL = "https://openapi.naver.com/v1/nid/me";

	
	@Autowired
	private UserService userService;
	
    @GetMapping("")
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }
 
    @GetMapping("/{userid}")
    public UserDto getUserByUserId(@PathVariable String userid) {
        return userService.getUserByUserId(userid);
    }
    
    @GetMapping("/logout")
    public void logout() {
    	System.out.println(((UserDto)session.getAttribute("user")).getUserId());
        session.invalidate();
        session = null;
    }
    
    @PostMapping("/naverLogin")
    public String naverLogin(@RequestBody AccessTokenDto accessToken) {
    	System.out.println(accessToken.getAccessToken());
    	String apiURL = "https://openapi.naver.com/v1/nid/me";
        String headerStr = "Bearer " + accessToken.getAccessToken(); // Bearer 다음에 공백 추가
        String res = null;
		try {
			res = requestToServer(apiURL, headerStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return res;
    }
    
    @PostMapping("/login")
    public UserDto loginUser(@RequestBody UserDto user, HttpSession loginSession) {
    	session = loginSession;
        UserDto value = userService.matching(user,session);
        return value; //http://localhost:8081/user/login
    }
 
    @PostMapping("")
    public UserDto registerUser(@RequestBody UserDto user) {
    	System.out.println(user.getUserId());
        return userService.registerUser(user);
    }
 
    @PutMapping("/{userid}")
    public void modifyUser(@PathVariable("userid") String userid, @RequestBody UserDto user) {
       userService.modifyUser(userid, user);
    }
 
    @DeleteMapping("/{userid}")
    public void removeUser(@PathVariable String userid) {
       userService.removeUser(userid);
    }
    
    
    private String requestToServer(String apiURL, String headerStr) throws IOException {
        URL url = new URL(apiURL);
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("GET");
        System.out.println("header Str: " + headerStr);
        if(headerStr != null && !headerStr.equals("") ) {
          con.setRequestProperty("Authorization", headerStr);
        }
        int responseCode = con.getResponseCode();
        BufferedReader br;
        System.out.println("responseCode="+responseCode);
        if(responseCode == 200) { // 정상 호출
          br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        } else {  // 에러 발생
          br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
        }
        String inputLine;
        StringBuffer res = new StringBuffer();
        while ((inputLine = br.readLine()) != null) {
          res.append(inputLine);
        }
        br.close();
        if(responseCode==200) {
          return res.toString();
        } else {
          return null;
        }
      }
}


