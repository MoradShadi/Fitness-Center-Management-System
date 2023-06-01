package entity;

import java.sql.Date;

public class Member {
	
	private int memberId;
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private Date joinDate;
	private char gender;
	private int centerId;
	
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
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Date getJoinDate() {
		return joinDate;
	}
	
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getCenterId() {
		return centerId;
	}

	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Member() {}

	public Member(int memberId, String firstName, String lastName, String address, String phoneNumber, Date joinDate,
			char gender, int centerId) {
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.joinDate = joinDate;
		this.gender = gender;
		this.centerId = centerId;
	}

	public Member(String firstName, String lastName, String address, String phoneNumber, Date joinDate, char gender,
			int centerId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.joinDate = joinDate;
		this.gender = gender;
		this.centerId = centerId;
	}

}
