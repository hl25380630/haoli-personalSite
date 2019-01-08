package com.haoli.personalSite.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.haoli.personalSite.domain.User;
import com.haoli.personalSite.service.UserService;
import com.haoli.sdk.web.domain.JsonResponse;


@RestController
public class UserApi {

	@Autowired
	private UserService userService;
	
	@PostMapping("/user/register")
	public JsonResponse<String> register(@RequestBody User user) throws Exception {
		 userService.register(user);
		 return JsonResponse.success();
	}
	
}
