package entity;

import java.sql.Date;

public class Enrollment {

	private int enrollmentId;
	private int memberId;
	private int classId;
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
	
	public Date getPaymentDate() {
		return paymentDate;
	}
	
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	public int getEnrollmentId() {
		return enrollmentId;
	}

	public Enrollment(int memberId, int classId, Date paymentDate) {
		this.memberId = memberId;
		this.classId = classId;
		this.paymentDate = paymentDate;
	}

	public Enrollment() {}

	public Enrollment(int enrollmentId, int memberId, int classId, Date paymentDate) {
		this.enrollmentId = enrollmentId;
		this.memberId = memberId;
		this.classId = classId;
		this.paymentDate = paymentDate;
	}
	
	
}
