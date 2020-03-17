package com.ayzekstudio.template.webtemplate.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="user", catalog = "ayzek_webtemplate")
public class User {

	// define fields
	@Id
	@Column(name="username")
	private String username;

	@Column(name="passwd")
	private String passwd;

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;

	@Column(name="phone")
	private String phone;

	@Column(name="email")
	private String email;

	@Column(name="enabled")
	private boolean enabled;

	private Set<UserRole> userRole = new HashSet<UserRole>(0);

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

	public User(String username, String passwd, String firstName, String lastName, String phone, String email, boolean enabled, Set<UserRole> userRole) {
		this.username = username;
		this.passwd = passwd;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.enabled = enabled;
		this.userRole = userRole;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String user) {
		this.username = user;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(username, user.username) &&
				Objects.equals(passwd, user.passwd) &&
				Objects.equals(firstName, user.firstName) &&
				Objects.equals(lastName, user.lastName) &&
				Objects.equals(phone, user.phone) &&
				Objects.equals(email, user.email) &&
				Objects.equals(userRole, user.userRole);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, passwd, firstName, lastName, phone, email, userRole);
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", passwd='" + passwd + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", userRole=" + userRole +
				'}';
	}
}











