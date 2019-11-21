package com.gjr.zhengwenhao.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjr.zhengwenhao.entity.User;

public interface UseDao extends JpaRepository<User,Long>{
	List<User> findAll();

			
}
