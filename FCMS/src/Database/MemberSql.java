package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entity.Member;

public class MemberSql {

	// Return "Member added successfully" or " Something went wrong..." 
	public String addMember (Member member){
		Connection conn = DBConnection.getConnection();

		String query = "CALL InsertMember(?, ?, ?, ?, ?, ?, ?);";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, member.getFirstName());
			stmt.setString(2, member.getLastName());
			stmt.setString(3, member.getAddress());
			stmt.setString(4, member.getPhoneNumber());
			stmt.setDate(5, member.getJoinDate());
			stmt.setString(6, String.valueOf(member.getGender()));
			stmt.setInt(7, member.getCenterId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to add member!";
		}
		return "Member added successfully";
	}
	
	// Return "Member updated successfully" or " Something went wrong..." 
	public String updateMember (Member member) {
		Connection conn = DBConnection.getConnection();

		String query = "UPDATE member SET member_fname = ?, member_lname = ?, memberr_address = ?, member_phone = ?, "
				+ "member_join_date = ?, gender = ?, centre_id = ?"
				+ " WHERE member_id = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, member.getFirstName());
			stmt.setString(2, member.getLastName());
			stmt.setString(3, member.getAddress());
			stmt.setString(4, member.getPhoneNumber());
			stmt.setDate(5, member.getJoinDate());
			stmt.setString(6, String.valueOf(member.getGender()));
			stmt.setInt(7, member.getCenterId());
			stmt.setInt(8, member.getMemberId());
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to update member!";
		}
		return "Member updated successfully";
	}
	
	// Return "Member deleted successfully" or " Something went wrong..." 
	public String deleteMember (int memberId) {
		Connection conn = DBConnection.getConnection();

		String query = "DELETE FROM member"
				+ " WHERE member_id = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, memberId);
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to delete member!";
		}
		return "Member deleted successfully";
	}
	
	// Return a list of Members
	public List<Member> getAllMembers () {
		Connection conn = DBConnection.getConnection();
		List<Member> members = new ArrayList<Member>();
		String query = "SELECT * FROM member";
		System.out.println(query);
		try {
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while (result.next()) {
				Member member = new Member(result.getInt(1), result.getString(2),
						result.getString(3), result.getString(4), result.getString(5),
						result.getDate(6),  result.getString(7).charAt(0), result.getInt(8));
				members.add(member);
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
		return members;
	}
	
	// Return a Member
	public Member getMember (int memberId) {
		Connection conn = DBConnection.getConnection();
		Member member = new Member();
		String query = "SELECT * FROM member"
				+ " WHERE member_id = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, memberId);
			ResultSet result = stmt.executeQuery();
			while (result.next()) {
				member.setMemberId(result.getInt(1));
				member.setFirstName(result.getString(2));
				member.setLastName(result.getString(3));
				member.setAddress(result.getString(4));
				member.setPhoneNumber(result.getString(5));
				member.setJoinDate(result.getDate(6));
				member.setGender(result.getString(7).charAt(0));
				member.setCenterId(result.getInt(8));
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
		return member;
	}
}
