package entity;

import java.util.Date;

public class Staff {

	private int staffId;
	private char roleId;
	private int centerId;
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private Date startDate;
	private Boolean firstAidCertified;
	
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
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Boolean getFirstAidCertified() {
		return firstAidCertified;
	}
	
	public void setFirstAidCertified(Boolean firstAidCertified) {
		this.firstAidCertified = firstAidCertified;
	}
	
	public int getStaffId() {
		return staffId;
	}

	public Staff(char roleId, int centerId, String firstName, String lastName, int phoneNumber, Date startDate,
			Boolean firstAidCertified) {
		this.roleId = roleId;
		this.centerId = centerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.startDate = startDate;
		this.firstAidCertified = firstAidCertified;
	}

	public Staff() {}
	
}
