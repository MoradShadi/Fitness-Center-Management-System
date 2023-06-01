package entity;

import java.sql.Date;

public class Staff {

	private int staffId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Date startDate;
	private char firstAidCertified;
	private int centerId;
	private char roleId;
	
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public char getRoleId() {
		return roleId;
	}
	
	public void setRoleId(char roleId) {
		this.roleId = roleId;
	}
	
	public int getCenterId() {
		return centerId;
	}
	
	public void setCenterId(int centerId) {
		this.centerId = centerId;
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
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	
	public char getFirstAidCertified() {
		return firstAidCertified;
	}

	public void setFirstAidCertified(char firstAidCertified) {
		this.firstAidCertified = firstAidCertified;
	}

	public int getStaffId() {
		return staffId;
	}

	public Staff() {}


	public Staff(int staffId, String firstName, String lastName, String phoneNumber, Date startDate, char firstAidCertified,
			int centerId, char roleId) {
		this.staffId = staffId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.startDate = startDate;
		this.firstAidCertified = firstAidCertified;
		this.centerId = centerId;
		this.roleId = roleId;
	}
	
	public Staff(String firstName, String lastName, String phoneNumber, Date startDate, char firstAidCertified,
			int centerId, char roleId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.startDate = startDate;
		this.firstAidCertified = firstAidCertified;
		this.centerId = centerId;
		this.roleId = roleId;
	}

}
