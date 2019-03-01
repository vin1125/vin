package com.hzit.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data

@AllArgsConstructor
@NoArgsConstructor

public class Dept implements Serializable {
	
	private long deptno;
	private String dname;
	private String loc;
	

}
