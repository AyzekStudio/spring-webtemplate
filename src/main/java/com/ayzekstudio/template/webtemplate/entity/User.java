package com.ayzekstudio.template.webtemplate.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="user")
public class User {

	// define fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user")
	private int user;

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
	
		
	// define constructors
	public User() {
		
	}

	public User(int user, String passwd, String firstName, String lastName, String phone, String email) {
		this.user = user;
		this.passwd = passwd;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
	}

	// define getter/setter


	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
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

	// define equals, toString and hashCode
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user1 = (User) o;
		return user == user1.user &&
				Objects.equals(passwd, user1.passwd) &&
				Objects.equals(firstName, user1.firstName) &&
				Objects.equals(lastName, user1.lastName) &&
				Objects.equals(phone, user1.phone) &&
				Objects.equals(email, user1.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(user, passwd, firstName, lastName, phone, email);
	}

	@Override
	public String toString() {
		return "User{" +
				"user=" + user +
				", passwd='" + passwd + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}











