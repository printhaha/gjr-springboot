package com.gjr.zhengwenhao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gjr.zhengwenhao.entity.User;
import com.gjr.zhengwenhao.service.UserService;
@Controller
public class UserController {
	@Autowired UserService userService;
	@ResponseBody
	@RequestMapping("/home")
   public List<User> find() {
	   return userService.findAll();
   }
}