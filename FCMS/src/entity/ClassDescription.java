package entity;

public class ClassDescription {
	
	private String classType;
	private String classDescription;
	
	public String getClassType() {
		return classType;
	}
	
	public void setClassType(String classType) {
		this.classType = classType;
	}
	
	public String getClassDescription() {
		return classDescription;
	}
	
	public void setClassDescription(String classDescription) {
		this.classDescription = classDescription;
	}

	public ClassDescription(String classType, String classDescription) {
		this.classType = classType;
		this.classDescription = classDescription;
	}

	public ClassDescription() {}
	
}
