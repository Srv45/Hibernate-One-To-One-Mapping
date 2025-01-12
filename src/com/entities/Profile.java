package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Profiles")
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int profile_id;
	private String name;
	private String address;
	private String mobile;
	private String email;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User users;

	public Profile() {

	}

	public Profile(int profile_id, String name, String address, String mobile, String email, User users) {
		super();
		this.profile_id = profile_id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.users = users;

	}

	public int getProfile_id() {
		return profile_id;
	}

	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Profile [profile_id=" + profile_id + ", name=" + name + ", address=" + address + ", mobile=" + mobile
				+ ", email=" + email + ", users=" + users + "]";
	}

}
