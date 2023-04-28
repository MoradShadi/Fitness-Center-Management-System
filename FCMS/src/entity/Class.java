package entity;

import java.util.Date;

public class Class {

	private int classId;
	private Date classDate;
	private int centerId;
	private String classType;
	private int roomNumber;
	private int maxParticipants;
	private int classSessions;
	private double classCost;
	private char genderRestrictions;
	private int nbParticipants;
	
	public Date getClassDate() {
		return classDate;
	}
	
	public void setClassDate(Date classDate) {
		this.classDate = classDate;
	}
	
	public int getCenterId() {
		return centerId;
	}
	
	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}
	
	public String getClassType() {
		return classType;
	}
	
	public void setClassType(String classType) {
		this.classType = classType;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public int getMaxParticipants() {
		return maxParticipants;
	}
	
	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}
	
	public int getClassSessions() {
		return classSessions;
	}
	
	public void setClassSessions(int classSessions) {
		this.classSessions = classSessions;
	}
	
	public double getClassCost() {
		return classCost;
	}
	
	public void setClassCost(double classCost) {
		this.classCost = classCost;
	}
	
	public char getGenderRestrictions() {
		return genderRestrictions;
	}
	
	public void setGenderRestrictions(char genderRestrictions) {
		this.genderRestrictions = genderRestrictions;
	}
	
	public int getClassId() {
		return classId;
	}

	public int getNbParticipants() {
		return nbParticipants;
	}

	public void setNbParticipants(int nbParticipants) {
		this.nbParticipants = nbParticipants;
	}

	public Class(Date classDate, int centerId, String classType, int roomNumber, int maxParticipants, int classSessions,
			double classCost, char genderRestrictions, int nbParticipants) {
		this.classDate = classDate;
		this.centerId = centerId;
		this.classType = classType;
		this.roomNumber = roomNumber;
		this.maxParticipants = maxParticipants;
		this.classSessions = classSessions;
		this.classCost = classCost;
		this.genderRestrictions = genderRestrictions;
		this.nbParticipants = nbParticipants;
	}

	public Class() {}
	
}
