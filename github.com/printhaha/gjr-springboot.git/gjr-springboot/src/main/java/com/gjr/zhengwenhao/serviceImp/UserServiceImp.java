package com.gjr.zhengwenhao.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gjr.zhengwenhao.dao.UseDao;
import com.gjr.zhengwenhao.entity.User;
import com.gjr.zhengwenhao.service.UserService;
@Service
public class UserServiceImp implements UserService {
    /**
     *autuor zhenwenhao
     */
	@Autowired UseDao useDao;
   
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
     
	return  useDao.findAll();
	}
	
	
}
