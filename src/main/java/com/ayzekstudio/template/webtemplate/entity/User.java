package com.ayzekstudio.template.webtemplate.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="user", catalog = "ayzek_webtemplate")
public class User {

	// define fields
	@Id
	private String username;

	private String passwd;

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;

	private String phone;

	private String email;

	private boolean enabled;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<UserRole> userRoles = new HashSet<UserRole>(0);

	// define constructors
	public User() {
		
	}

	public User(String username, String passwd, String firstName, String lastName, String phone, String email, boolean enabled) {
		this.username = username;
		this.passwd = passwd;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.enabled = enabled;
	}

	public User(String username, String passwd, String firstName, String lastName, String phone, String email, boolean enabled, Set<UserRole> userRoles) {
		this.username = username;
		this.passwd = passwd;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.enabled = enabled;
		this.userRoles = userRoles;
	}

	public void addUserRole(UserRole userRole) {
		this.userRoles.add(userRole);
	}

}











