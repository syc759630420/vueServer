package com.tanoak;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 656443534@qq.com
 * @date 2018/6/3 1:20
 * @Desc
 */
@Data
public class User implements Serializable {
	private String username ;
	private String password ;

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
}
