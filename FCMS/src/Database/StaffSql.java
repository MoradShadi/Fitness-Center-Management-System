package Database;

import java.util.ArrayList;
import java.util.List;

import entity.ClassStaffing;
import entity.Role;
import entity.Staff;

public class StaffSql {

	// Return "Staff Member added successfully" or " Something went wrong..." 
	public String addStaffMember (Staff staff) {
		return "";
	}
	
	// Return "Staff Member updated successfully" or " Something went wrong..." 
	public String UpdateStaffMember (Staff staff) {
		return "";
	}
	
	// Return "Staff Member deleted successfully" or " Something went wrong..." 
	public String deleteStafMember (Staff staff) {
		return "";
	}
	
	// Return a list of staff Members
	public List<Staff> getAllStaff () {
		List<Staff> staffMembers = new ArrayList<Staff>();
		return staffMembers;
	}
	
	// Return a list of staff Members roles
	public List<Role> getAllRoles () {
		List<Role> roles = new ArrayList<Role>();
		return roles;
	}
	
	// Return a Staff Member
	public Staff getStaff (int staffId) {
		Staff staff = new Staff();
		return staff;
	}
	
	// add class staffing
	public String addAssignement(ClassStaffing staffing) {
		return "";
	}
	
	// delete class staffing
	public String deleteAssignement(ClassStaffing staffing) {
		return "";
	}
}
