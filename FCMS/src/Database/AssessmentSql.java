package Database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Assessments;

public final class AssessmentSql {

	// Return "Assessment added successfully" or " Something went wrong..." 
	public static String addAssessment (Assessments assessment) {
		Connection conn = DBConnection.getConnection();

		String query = "INSERT INTO assessments VALUES (?,?,?,?,?,?,?,?,?,?)";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, assessment.getMemberId());
			stmt.setDate(2, assessment.getAssessmentDate());
			stmt.setInt(3, assessment.getMemberWeight());
			stmt.setInt(4, assessment.getMemberHeight());
			stmt.setInt(5, assessment.getMemberAge());
			stmt.setDouble(6, assessment.getMemberBMI());
			stmt.setDouble(7, assessment.getMemberBoneMass());
			stmt.setDouble(8, assessment.getMemberFatMass());
			stmt.setDouble(9, assessment.getMemberMuscleMass());
			stmt.setInt(10, assessment.getStaffId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to add assessment!";
		}
		return "Assessment added successfully";
	}
	
	// Return "Assessment deleted successfully" or " Something went wrong..." 
	public static String deleteAssessment (int memberId, Date assessmentDate) {
		Connection conn = DBConnection.getConnection();

		String query = "DELETE FROM assessments"
				+ " WHERE member_id = ? AND assessment_date = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, memberId);
			stmt.setDate(2, assessmentDate);
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to delete Assessment!";
		}
		return "Assessment deleted successfully";
	}
}
