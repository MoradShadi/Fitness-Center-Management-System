package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Enrollment;

public final class EnrollmentSql {
	// Return "Enrollment added successfully" or " Something went wrong..." 
	public static String addEnrollment (Enrollment enrollment) {
		Connection conn = DBConnection.getConnection();

		String query = "INSERT INTO enrollment (member_id, class_numb, enrollment_payment_date)"
				+ " VALUES(?,?,?)";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, enrollment.getMemberId());
			stmt.setInt(2, enrollment.getClassId());
			stmt.setDate(3, enrollment.getPaymentDate());
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to add enrollment!";
		}
		return "Enrollment added successfully";
	}
	
	// Return "Enrollment deleted successfully" or " Something went wrong..." 
	public static String deleteEnrollment (int enrollmentId) {
		Connection conn = DBConnection.getConnection();

		String query = "DELETE FROM enrollment"
				+ " WHERE enrollment_no = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, enrollmentId);
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to delete enrollment!";
		}
		return "Enrollment deleted successfully";
	}
	
}
