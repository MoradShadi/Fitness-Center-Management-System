package Database;

import java.util.ArrayList;
import java.util.List;

import entity.Class;
import entity.ClassDescription;

public class ClassSql {

	// Return "Class added successfully" or " Something went wrong..." 
	public String addClass (Class cls) {
		return "";
	}
	
	// Return "Class updated successfully" or " Something went wrong..." 
	public String UpdateClass (Class cls) {
		return "";
	}
	
	// Return "Class deleted successfully" or " Something went wrong..." 
	public String deleteClass (Class cls) {
		return "";
	}
	
	// Return a list of Classes
	public List<Class> getAllClasses () {
		List<Class> cls = new ArrayList<Class>();
		return cls;
	}
	
	// Return a list of Classes
	public List<ClassDescription> getClassTypes () {
		List<ClassDescription> clsType = new ArrayList<ClassDescription>();
		return clsType;
	}
	
	// Return a class
	public Class getStaff (int classId) {
		Class cls = new Class();
		return cls;
	}
}
