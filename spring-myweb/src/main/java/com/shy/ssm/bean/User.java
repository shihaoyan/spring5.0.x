package com.shy.ssm.bean;

import java.util.Date;

/**
 * @author 石皓岩
 * @create 2020-03-01 19:43
 * 描述：
 */
public class User {
	private Integer id;
	private String username;
	private String password;
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
	}

	public User(Integer id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public User(Integer id, String username, String password, Date date) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.date = date;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", date=" + date +
				'}';
	}
}
