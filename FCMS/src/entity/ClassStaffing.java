package entity;

import java.util.Date;

public class ClassStaffing {

	private int classStaffingId;
	private int staffId;
	private int classId;
	private int centerId;
	private Date classDate;
	private boolean classLeader;
	
	public int getStaffId() {
		return staffId;
	}
	
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	
	public int getClassId() {
		return classId;
	}
	
	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	public int getCenterId() {
		return centerId;
	}
	
	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}
	
	public Date getClassDate() {
		return classDate;
	}
	
	public void setClassDate(Date classDate) {
		this.classDate = classDate;
	}
	
	public boolean isClassLeader() {
		return classLeader;
	}
	
	public void setClassLeader(boolean classLeader) {
		this.classLeader = classLeader;
	}
	
	public int getClassStaffingId() {
		return classStaffingId;
	}

	public ClassStaffing(int staffId, int classId, int centerId, Date classDate, boolean classLeader) {
		this.staffId = staffId;
		this.classId = classId;
		this.centerId = centerId;
		this.classDate = classDate;
		this.classLeader = classLeader;
	}

	public ClassStaffing() {}

}
