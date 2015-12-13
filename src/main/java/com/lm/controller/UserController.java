package com.lm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lm.entity.UserEntity;
import com.lm.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userServiceImpl;
	
	//http://localhost:8085/user_cms/userController/1/showUser.do
	@RequestMapping("/{id}/showUser")
	public String showUser(@PathVariable String id, ModelMap modelMap ,HttpServletRequest request) {
		UserEntity u = userServiceImpl.getUserEntityById(id);
	
		if(u == null){
			u = new UserEntity();
			u.setEmail("");
			u.setUserId("");
		}
		modelMap.put("user", u);
		return "showUser";
	}
	
	//http://localhost:8085/user_cms/userController/showUser.do?id=1
	@RequestMapping("showUser")
	public String showUserEntity(String id, ModelMap modelMap,HttpServletRequest request) {
		UserEntity u = userServiceImpl.getUserEntityById(id);
		if(u == null){
			u = new UserEntity();
			u.setEmail("");
			u.setUserId("");
		}
		modelMap.put("user", u);
		return "showUser";
	}
	
	@RequestMapping("/showUserExample")
	public String showUsers(Model model){
		return "redirect:/1/showUser.do";
	}
	
    @RequestMapping("/userList")
    public String list(ModelMap model) {
        model.put("users", userServiceImpl.getUserEntities());
        return "list";
    }
    
    @RequestMapping("/user/{id}")
    public String detail(@PathVariable(value = "id") String id, ModelMap model) {
        model.put("user", userServiceImpl.getUserEntityById(id));
        return "detail";
    }
    @RequestMapping("/goto")
    public String gotodemo(HttpServletRequest request) {
    	return "page-login";
    }

}