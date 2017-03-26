package com.webapp.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users implements Serializable{
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long user_id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
//	@Column(name = "user_name")
//	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "user_type")
	private String userType;

	@Column(name = "birthDate")
	private Date dob;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "created_on")
	private Timestamp createdOn;
	
	@Column(name = "updated_on")
	private Timestamp updatedOn;
	
	
	
	
	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}


	public Users(String firstName, String lastName, String userName, String password, String email,
			String userType, Date dob, int age, String address, String gender, Calendar createdOn, Calendar updatedOn) {
		super();
		
		Calendar calendar = Calendar.getInstance();
		Timestamp currentTimeStamp = new java.sql.Timestamp(calendar.getTime().getTime());
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.userType = userType;
		this.dob = dob;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.createdOn = currentTimeStamp;
		this.updatedOn = currentTimeStamp;
	}

	// no argument constructor
	public Users(){
		Calendar calendar = Calendar.getInstance();
		Timestamp currentTimeStamp = new java.sql.Timestamp(calendar.getTime().getTime());
		
		this.firstName = "mafrel";
		this.lastName = "karki";
		this.password = "mafrel";
		this.email = "mafrelkarki@gmail.com";
		this.userType = "admin";
		this.dob = this.dob;
		this.age = this.age;
		this.address = "kathmandu Nepal";
		this.gender = "male";
		this.createdOn = currentTimeStamp;
		this.updatedOn = currentTimeStamp;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", firstName=" + firstName + ", lastName=" + lastName + ",  password=" + password + ", email=" + email + ", userType=" + userType + ", dob=" + dob
				+ ", age=" + age + ", address=" + address + ", gender=" + gender + ", createdOn=" + createdOn
				+ ", updatedOn=" + updatedOn + "]";
	}
	
	

}
