package entity;

import java.sql.Date;

public class Enrollment {

	private int enrollmentId;
	private int memberId;
	private int classId;
	private int centerId;
	private Date classDate;
	private Date paymentDate;
	
	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
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
	
	public Date getPaymentDate() {
		return paymentDate;
	}
	
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	public int getEnrollmentId() {
		return enrollmentId;
	}

	public Enrollment(int memberId, int classId, int centerId, Date classDate, Date paymentDate) {
		this.memberId = memberId;
		this.classId = classId;
		this.centerId = centerId;
		this.classDate = classDate;
		this.paymentDate = paymentDate;
	}

	public Enrollment() {}

	public Enrollment(int enrollmentId, int memberId, int classId, int centerId, Date classDate, Date paymentDate) {
		this.enrollmentId = enrollmentId;
		this.memberId = memberId;
		this.classId = classId;
		this.centerId = centerId;
		this.classDate = classDate;
		this.paymentDate = paymentDate;
	}
	
	
}
