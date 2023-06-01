package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Class;
import entity.ClassDescription;
import entity.ClassStaffing;

public class ClassSql {

	// Return "Class added successfully" or " Something went wrong..." 
	public String addClass (Class cls) {
		Connection conn = DBConnection.getConnection();

		String query = "INSERT INTO class (centre_id, class_start_date, class_start_time, "
				+ "class_max_participants, class_sessions, class_cost, class_type, "
				+ "facility_room_numb, class_gender_restrictions, class_nb_participants)"
				+ " VALUES (?,?,?,?,?,?,?,?,?,?)";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, cls.getCenterId());
			stmt.setDate(2, cls.getClassDate());
			stmt.setTime(3, cls.getClassTime());
			stmt.setInt(4, cls.getMaxParticipants());
			stmt.setInt(5, cls.getClassSessions());
			stmt.setDouble(6, cls.getClassCost());
			stmt.setString(7, cls.getClassType());
			stmt.setInt(8, cls.getRoomNumber());
			stmt.setString(9, String.valueOf(cls.getGenderRestrictions()));
			stmt.setInt(10, cls.getNbParticipants());
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to add class!";
		}
		return "Class added successfully";
	}
	
//	public String AddClassAndStaffing (Class cls, ClassStaffing staffing) {
//		
//		Connection conn = DBConnection.getConnection();
//
//		String query = "START TRANSACTION;\n"
//				+ "INSERT INTO class (centre_id, class_start_date, class_start_time, "
//				+ "class_max_participants, class_sessions, class_cost, class_type, "
//				+ "facility_room_numb, class_gender_restrictions)\n"
//				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? );\n"
//				+ "SET @class_id := LAST_INSERT_ID();\n"
//				+ "INSERT INTO class_staffing (staff_id, class_numb, class_leader)\n"
//				+ "VALUES (?, @class_id, ?);\n"
//				+ "COMMIT;\n"
//				+ "";
//		System.out.println(query);
//		try {
//			PreparedStatement stmt = conn.prepareStatement(query);
//			stmt.setInt(1, cls.getCenterId());
//			stmt.setDate(2, cls.getClassDate());
//			stmt.setTime(3, cls.getClassTime());
//			stmt.setInt(4, cls.getMaxParticipants());
//			stmt.setInt(5, cls.getClassSessions());
//			stmt.setDouble(6, cls.getClassCost());
//			stmt.setString(7, cls.getClassType());
//			stmt.setInt(8, cls.getRoomNumber());
//			stmt.setString(9, String.valueOf(cls.getGenderRestrictions()));
////			stmt.setInt(10, cls.getNbParticipants());
//			stmt.setInt(10, staffing.getStaffId());
//			stmt.setString(11, String.valueOf(staffing.isClassLeader()));
//			stmt.executeUpdate();
//		} catch (SQLException e) {
//			System.out.println(e);
//			return "Something went wrong! Unable to add class!";
//		}
//		return "Class added successfully";
//	
//	}
	
	// Return "Class updated successfully" or " Something went wrong..." 
	public String UpdateClass (Class cls) {
		Connection conn = DBConnection.getConnection();

		String query = "UPDATE class SET "
				+ " centre_id = ?, class_start_date = ?, class_start_time = ?, "
				+ "class_max_participants = ?, class_sessions = ?, class_cost = ?, class_type = ?, "
				+ "facility_room_numb = ?, class_gender_restrictions = ?, "
				+ "class_nb_participants = ? WHERE class_numb = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, cls.getCenterId());
			stmt.setDate(2, cls.getClassDate());
			stmt.setTime(3, cls.getClassTime());
			stmt.setInt(4, cls.getMaxParticipants());
			stmt.setInt(5, cls.getClassSessions());
			stmt.setDouble(6, cls.getClassCost());
			stmt.setString(7, cls.getClassType());
			stmt.setInt(8, cls.getRoomNumber());
			stmt.setString(9, String.valueOf(cls.getGenderRestrictions()));
			stmt.setInt(10, cls.getNbParticipants());
			stmt.setInt(11, cls.getClassId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to update class!";
		}
		return "Class updated successfully";
	}
	
	// Return "Class deleted successfully" or " Something went wrong..." 
	public String deleteClass (int classId) {
		Connection conn = DBConnection.getConnection();

		String query = "DELETE FROM class"
				+ " WHERE class_numb = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, classId);
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to delete class!";
		}
		return "Class deleted successfully";
	}
	
	// Return a list of Classes
	public List<Class> getAllClasses () {
		Connection conn = DBConnection.getConnection();
		List<Class> classes = new ArrayList<Class>();
		String query = "SELECT * FROM class";
		System.out.println(query);
		try {
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while (result.next()) {
				Class cls = new Class(result.getInt(1), result.getInt(2), result.getDate(3),
						result.getTime(4), result.getInt(5) , result.getInt(6),
						result.getDouble(7), result.getString(8), result.getInt(9),
						result.getString(10).charAt(0), result.getInt(11));
				classes.add(cls);
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
		return classes;
	}
	
	// Return a list of Classes
	public List<ClassDescription> getClassTypes () {
		Connection conn = DBConnection.getConnection();
		List<ClassDescription> classTypes = new ArrayList<ClassDescription>();
		String query = "SELECT * FROM class_description";
		System.out.println(query);
		try {
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while (result.next()) {
				ClassDescription classType = new ClassDescription(result.getString(1), result.getString(2));
				classTypes.add(classType);
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
		return classTypes;
	}
	
	// Return a class
	public Class getClass (int classId) {
		Connection conn = DBConnection.getConnection();
		Class cls = new Class();
		String query = "SELECT * FROM class"
				+ " WHERE class_numb = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, classId);
			ResultSet result = stmt.executeQuery();
			while (result.next()) {
				cls.setClassId(result.getInt(1));
				cls.setCenterId(result.getInt(2));
				cls.setClassDate(result.getDate(3));
				cls.setClassTime(result.getTime(4));
				cls.setMaxParticipants(result.getInt(5));
				cls.setClassSessions(result.getInt(6));
				cls.setClassCost(result.getDouble(7));
				cls.setClassType(result.getString(8));
				cls.setRoomNumber(result.getInt(9));
				cls.setGenderRestrictions(result.getString(10).charAt(0));
				cls.setNbParticipants(result.getInt(11));
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
		return cls;
	}
}
