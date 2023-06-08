package entity;

import java.sql.Date;
import java.sql.Time;

public class Class {

	private int classId;
	private int centerId;
	private Date classDate;
	private Time classTime;
	private int maxParticipants;
	private int classSessions;
	private double classCost;
	private String classType;
	private int roomNumber;
	private char genderRestrictions;
	private int nbParticipants;
	
	
	public Time getClassTime() {
		return classTime;
	}

	public void setClassTime(Time classTime) {
		this.classTime = classTime;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

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

	public Class() {}

	public Class(int classId, int centerId, Date classDate, Time classTime, int maxParticipants, int classSessions,
			double classCost, String classType, int roomNumber, char genderRestrictions, int nbParticipants) {
		this.classId = classId;
		this.centerId = centerId;
		this.classDate = classDate;
		this.classTime = classTime;
		this.maxParticipants = maxParticipants;
		this.classSessions = classSessions;
		this.classCost = classCost;
		this.classType = classType;
		this.roomNumber = roomNumber;
		this.genderRestrictions = genderRestrictions;
		this.nbParticipants = nbParticipants;
	}

	public Class(int centerId, Date classDate, Time classTime, int maxParticipants, int classSessions, double classCost,
			String classType, int roomNumber, char genderRestrictions, int nbParticipants) {
		this.centerId = centerId;
		this.classDate = classDate;
		this.classTime = classTime;
		this.maxParticipants = maxParticipants;
		this.classSessions = classSessions;
		this.classCost = classCost;
		this.classType = classType;
		this.roomNumber = roomNumber;
		this.genderRestrictions = genderRestrictions;
		this.nbParticipants = nbParticipants;
	}

//	public Class(int centerId, Date classDate, Time classTime, int maxParticipants, int classSessions, double classCost,
//			String classType, int roomNumber, char genderRestrictions) {
//		this.centerId = centerId;
//		this.classDate = classDate;
//		this.classTime = classTime;
//		this.maxParticipants = maxParticipants;
//		this.classSessions = classSessions;
//		this.classCost = classCost;
//		this.classType = classType;
//		this.roomNumber = roomNumber;
//		this.genderRestrictions = genderRestrictions;
//	}


	@Override
	public String toString() {
		return "Class{" +
				"classId=" + classId +
				", centerId=" + centerId +
				", classDate=" + classDate +
				", classTime=" + classTime +
				", maxParticipants=" + maxParticipants +
				", classSessions=" + classSessions +
				", classCost=" + classCost +
				", classType='" + classType + '\'' +
				", roomNumber=" + roomNumber +
				", genderRestrictions=" + genderRestrictions +
				", nbParticipants=" + nbParticipants +
				'}';
	}
}
