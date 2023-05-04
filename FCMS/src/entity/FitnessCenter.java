package entity;

public class FitnessCenter {

	private int centerId;
	private String centerName;
	private String centerStreet;
	private String centerTown;
	private String centerPost;
	private int centerPhoneNumber;
	private int staffId;
	
	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}

	public int getStaffId() {
		return staffId;
	}
	
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	
	public String getCenterName() {
		return centerName;
	}
	
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	
	public String getCenterStreet() {
		return centerStreet;
	}
	
	public void setCenterStreet(String centerStreet) {
		this.centerStreet = centerStreet;
	}
	
	public String getCenterTown() {
		return centerTown;
	}
	
	public void setCenterTown(String centerTown) {
		this.centerTown = centerTown;
	}
	
	public String getCenterPost() {
		return centerPost;
	}
	
	public void setCenterPost(String centerPost) {
		this.centerPost = centerPost;
	}
	
	public int getCenterPhoneNumber() {
		return centerPhoneNumber;
	}
	
	public void setCenterPhoneNumber(int centerPhoneNumber) {
		this.centerPhoneNumber = centerPhoneNumber;
	}
	
	public int getCenterId() {
		return centerId;
	}

	public FitnessCenter() {}

	public FitnessCenter(int centerId, String centerName, String centerStreet, String centerTown, String centerPost,
			int centerPhoneNumber, int staffId) {
		this.centerId = centerId;
		this.centerName = centerName;
		this.centerStreet = centerStreet;
		this.centerTown = centerTown;
		this.centerPost = centerPost;
		this.centerPhoneNumber = centerPhoneNumber;
		this.staffId = staffId;
	}

	public FitnessCenter(String centerName, String centerStreet, String centerTown, String centerPost,
			int centerPhoneNumber, int staffId) {
		this.centerName = centerName;
		this.centerStreet = centerStreet;
		this.centerTown = centerTown;
		this.centerPost = centerPost;
		this.centerPhoneNumber = centerPhoneNumber;
		this.staffId = staffId;
	}

	
	
}
