package entity;

import java.util.Date;

public class Assessments {
	
	private int memberId;
	private Date assessmentDate;
	private int staffId;
	private int memberWeight;
	private int memberAge;
	private double memberBMI;
	private int memberHeight;
	private double memberBoneMass;
	private double memberFatMass;
	private double memberMuscleMass;
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public Date getAssessmentDate() {
		return assessmentDate;
	}
	
	public void setAssessmentDate(Date assessmentDate) {
		this.assessmentDate = assessmentDate;
	}
	
	public int getStaffId() {
		return staffId;
	}
	
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	
	public int getMemberWeight() {
		return memberWeight;
	}
	
	public void setMemberWeight(int memberWeight) {
		this.memberWeight = memberWeight;
	}
	
	public double getMemberBMI() {
		return memberBMI;
	}
	
	public void setMemberBMI(double memberBMI) {
		this.memberBMI = memberBMI;
	}
	
	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public int getMemberHeight() {
		return memberHeight;
	}

	public void setMemberHeight(int memberHeight) {
		this.memberHeight = memberHeight;
	}

	public double getMemberBoneMass() {
		return memberBoneMass;
	}

	public void setMemberBoneMass(double memberBoneMass) {
		this.memberBoneMass = memberBoneMass;
	}

	public double getMemberFatMass() {
		return memberFatMass;
	}

	public void setMemberFatMass(double memberFatMass) {
		this.memberFatMass = memberFatMass;
	}

	public double getMemberMuscleMass() {
		return memberMuscleMass;
	}

	public void setMemberMuscleMass(double memberMuscleMass) {
		this.memberMuscleMass = memberMuscleMass;
	}

	
	
	public Assessments(Date assessmentDate, int staffId, int memberWeight, int memberAge, double memberBMI,
			int memberHeight, double memberBoneMass, double memberFatMass, double memberMuscleMass) {
		this.assessmentDate = assessmentDate;
		this.staffId = staffId;
		this.memberWeight = memberWeight;
		this.memberAge = memberAge;
		this.memberBMI = memberBMI;
		this.memberHeight = memberHeight;
		this.memberBoneMass = memberBoneMass;
		this.memberFatMass = memberFatMass;
		this.memberMuscleMass = memberMuscleMass;
	}

	public Assessments() {}
	
	
	
}
