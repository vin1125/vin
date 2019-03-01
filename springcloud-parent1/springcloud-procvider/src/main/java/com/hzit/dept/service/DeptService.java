package com.hzit.dept.service;

import java.util.List;

import com.hzit.bean.Dept;

public interface DeptService {
	
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();

}
