package com.hzit.dept.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzit.bean.Dept;
import com.hzit.dept.mapper.DeptMapper;
import com.hzit.dept.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public boolean addDept(Dept dept) {

		 boolean addDept = deptMapper.addDept(dept);
		return addDept;
	}

	@Override
	public Dept findById(Long id) {

		Dept dept = deptMapper.findById(id);
		
		return dept;
	}

	@Override
	public List<Dept> findAll() {
		
		List<Dept> deptList = deptMapper.findAll();
		
		return deptList;
	}

}
