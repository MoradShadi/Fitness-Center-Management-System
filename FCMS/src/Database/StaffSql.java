package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.ClassStaffing;
import entity.Role;
import entity.Staff;

public class StaffSql {

	// Return "Staff Member added successfully" or " Something went wrong..." 
	public String addStaffMember (Staff staff) {
		Connection conn = DBConnection.getConnection();

		String query = "INSERT INTO staff (staff_fname, staff_lname, staff_phone, staff_startdate, first_aid_certified, centre_id, role_id)"
				+ " VALUES(?,?,?,?,?,?,?)";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, staff.getFirstName());
			stmt.setString(2, staff.getLastName());
			stmt.setString(3, staff.getPhoneNumber());
			stmt.setDate(4, staff.getStartDate());
			stmt.setString(5, String.valueOf(staff.getFirstAidCertified()));
			stmt.setInt(6, staff.getCenterId());
			stmt.setString(7, String.valueOf(staff.getRoleId()));
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to add staff member!";
		}
		return "Staff member added successfully";
	}
	
	// Return "Staff Member updated successfully" or " Something went wrong..." 
	public String UpdateStaffMember (Staff staff) {
		Connection conn = DBConnection.getConnection();

		String query = "UPDATE staff SET staff_fname = ?, staff_lname = ?, "
				+ "staff_phone = ?, staff_startdate = ?, "
				+ "first_aid_certified = ?, centre_id = ?, role_id = ?"
				+ " WHERE staff_id = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, staff.getFirstName());
			stmt.setString(2, staff.getLastName());
			stmt.setString(3, staff.getPhoneNumber());
			stmt.setDate(4, staff.getStartDate());
			stmt.setString(5, String.valueOf(staff.getFirstAidCertified()));
			stmt.setInt(6, staff.getCenterId());
			stmt.setString(7, String.valueOf(staff.getRoleId()));
			stmt.setInt(8, staff.getStaffId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to update staff member!";
		}
		return "Staff member updated successfully";
	}
	
	// Return "Staff Member deleted successfully" or " Something went wrong..." 
	public String deleteStafMember (int staffId) {
		Connection conn = DBConnection.getConnection();

		String query = "DELETE FROM staff"
				+ " WHERE staff_id = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, staffId);
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to delete staff member!";
		}
		return "Staff member deleted successfully";
	}
	
	// Return a list of staff Members
	public List<Staff> getAllStaff () {
		Connection conn = DBConnection.getConnection();
		List<Staff> staffMembers = new ArrayList<Staff>();
		String query = "SELECT * FROM staff";
		System.out.println(query);
		try {
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while (result.next()) {
				Staff staffMember = new Staff(result.getInt(1), result.getString(2), 
						result.getString(3),result.getString(4), result.getDate(5), 
						result.getString(6).charAt(0), result.getInt(7), result.getString(8).charAt(0));
				staffMembers.add(staffMember);
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
		return staffMembers;
	}
	
	// Return a Staff Member
	public Staff getStaff (int staffId) {
		Connection conn = DBConnection.getConnection();
		Staff staff = new Staff();
		String query = "SELECT * FROM staff"
				+ " WHERE staff_id = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, staffId);
			ResultSet result = stmt.executeQuery();
			while (result.next()) {
				staff.setStaffId(result.getInt(1));
				staff.setFirstName(result.getString(2));
				staff.setLastName(result.getString(3));
				staff.setPhoneNumber(result.getString(4));
				staff.setStartDate(result.getDate(5));
				staff.setFirstAidCertified(result.getString(6).charAt(0));
				staff.setCenterId(result.getInt(7));
				staff.setRoleId(result.getString(8).charAt(0));
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
		return staff;
	}
	
	// Return a list of staff Members roles
	public List<Role> getAllRoles () {
		Connection conn = DBConnection.getConnection();
		List<Role> roles = new ArrayList<Role>();
		String query = "SELECT * FROM role";
		System.out.println(query);
		try {
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while (result.next()) {
				Role role = new Role(result.getString(1).charAt(0), result.getString(2));
				roles.add(role);
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
		return roles;
	}
	
	// add class staffing
	public String addAssignement(ClassStaffing staffing) {
		Connection conn = DBConnection.getConnection();

		String query = "INSERT INTO class_staffing (staff_id, class_numb, class_leader)"
				+ " VALUES(?,?,?)";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, staffing.getStaffId());
			stmt.setInt(2, staffing.getClassId());
			stmt.setString(3, String.valueOf(staffing.isClassLeader()));
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to add class staffing!";
		}
		return "Class staffing added successfully";
	}
	
	// delete class staffing
	public String deleteAssignement(int staffingId) {
		Connection conn = DBConnection.getConnection();

		String query = "DELETE FROM class_staffing"
				+ " WHERE class_staffing_no = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, staffingId);
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to delete class staffing!";
		}
		return "Class staffing deleted successfully";
	}
}
