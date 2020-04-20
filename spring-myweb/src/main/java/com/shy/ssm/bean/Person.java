package com.shy.ssm.bean;

import java.util.List;
import java.util.Map;

/**
 * @author 石皓岩
 * @create 2020-03-06 13:07
 * 描述：
 */
public class Person {
	public String name;
	public Integer age;

	// 基本数据类型
	public Boolean flag;
	public int index;
	public List<String> list;
	public Map<String, String> map;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
}
