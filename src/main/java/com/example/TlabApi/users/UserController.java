package com.example.TlabApi.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository UserObj;
	
	
	@RequestMapping("/test")
	public String test() {
		return "Hello";
		
	}
	

	@RequestMapping(
			method = RequestMethod.POST, 
			value = "/adduser", 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE )
	public User register(@RequestBody User user) throws Exception {
		
		return UserObj.save(user);
		
	}
	

}
