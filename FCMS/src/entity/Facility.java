package entity;

public class Facility {

	private int facilityRoomNumber;
	private int centerId;
	private String facilityName;
	private String facilityDescription;
	private int facilityCapacity;
	
	public int getFacilityRoomNumber() {
		return facilityRoomNumber;
	}
	
	public void setFacilityRoomNumber(int facilityRoomNumber) {
		this.facilityRoomNumber = facilityRoomNumber;
	}
	
	public int getCenterId() {
		return centerId;
	}
	
	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}
	
	public String getFacilityName() {
		return facilityName;
	}
	
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}
	
	public String getFacilityDescription() {
		return facilityDescription;
	}
	
	public void setFacilityDescription(String facilityDescription) {
		this.facilityDescription = facilityDescription;
	}
	
	public int getFacilityCapacity() {
		return facilityCapacity;
	}
	
	public void setFacilityCapacity(int facilityCapacity) {
		this.facilityCapacity = facilityCapacity;
	}

	public Facility(int facilityRoomNumber, int centerId, String facilityName, String facilityDescription,
			int facilityCapacity) {
		this.facilityRoomNumber = facilityRoomNumber;
		this.centerId = centerId;
		this.facilityName = facilityName;
		this.facilityDescription = facilityDescription;
		this.facilityCapacity = facilityCapacity;
	}

	public Facility() {}	
	
}
