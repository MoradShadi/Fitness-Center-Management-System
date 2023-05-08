package entity;

public class ClassStaffing {

	private int classStaffingId;
	private int staffId;
	private int classId;
	private boolean classLeader;
	
	
	public void setClassStaffingId(int classStaffingId) {
		this.classStaffingId = classStaffingId;
	}

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
	
	public boolean isClassLeader() {
		return classLeader;
	}
	
	public void setClassLeader(boolean classLeader) {
		this.classLeader = classLeader;
	}
	
	public int getClassStaffingId() {
		return classStaffingId;
	}

	public ClassStaffing(int staffId, int classId, boolean classLeader) {
		this.staffId = staffId;
		this.classId = classId;
		this.classLeader = classLeader;
	}

	public ClassStaffing() {}

	public ClassStaffing(int classStaffingId, int staffId, int classId, boolean classLeader) {
		this.classStaffingId = classStaffingId;
		this.staffId = staffId;
		this.classId = classId;
		this.classLeader = classLeader;
	}

	
}
