package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Facility;
import entity.FitnessCenter;

public class FitnessCenterSql {

	// Return "Center added successfully" or " Something went wrong..." 
	public String addCenter (FitnessCenter center) {
		Connection conn = DBConnection.getConnection();

		String query = "INSERT INTO fitness_centre (centre_name, centre_street, centre_town, centre_post, centre_phone)"
				+ " VALUES(?,?,?,?,?)";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, center.getCenterName());
			stmt.setString(2, center.getCenterStreet());
			stmt.setString(3, center.getCenterTown());
			stmt.setString(4, center.getCenterPost());
			stmt.setString(5, center.getCenterPhoneNumber());			
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to add center!";
		}
		return "Center added successfully";
	}
	
	// Return "Center updated successfully" or " Something went wrong..." 
	public String UpdateCenter (FitnessCenter center) {
		Connection conn = DBConnection.getConnection();

		String query = "UPDATE fitness_centre SET centre_name = ?, centre_street = ?, centre_town = ?, centre_post = ?, "
				+ "centre_phone = ?"
				+ " WHERE centre_id = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, center.getCenterName());
			stmt.setString(2, center.getCenterStreet());
			stmt.setString(3, center.getCenterTown());
			stmt.setString(4, center.getCenterPost());
			stmt.setString(5, center.getCenterPhoneNumber());
			stmt.setInt(6, center.getCenterId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to update center!";
		}
		return "Center updated successfully";
	}
	
	// Return "Center deleted successfully" or " Something went wrong..." 
	public String deleteCenter (int centerId) {
		Connection conn = DBConnection.getConnection();
		String query = "DELETE FROM fitness_centre"
				+ " WHERE centre_id = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, centerId);
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to delete center!";
		}
		return "Center deleted successfully";
	}
	
	// Return a list of Centers
	public List<FitnessCenter> getAllCenters () {
		Connection conn = DBConnection.getConnection();
		List<FitnessCenter> centers = new ArrayList<FitnessCenter>();
		String query = "SELECT * FROM fitness_centre";
		System.out.println(query);
		try {
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while (result.next()) {
				FitnessCenter center = new FitnessCenter(result.getInt(1), result.getString(2), result.getString(3),
						result.getString(4), result.getString(5), result.getString(6));
				centers.add(center);
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
		return centers;
	}

	// Return a list of Facility rooms
	public List<Facility> getAllrooms () {
		Connection conn = DBConnection.getConnection();
		List<Facility> rooms = new ArrayList<Facility>();
		String query = "SELECT * FROM facility";
		System.out.println(query);
		try {
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while (result.next()) {
				Facility facility = new Facility(result.getInt(1), result.getInt(2), result.getString(3),
						result.getString(4), result.getInt(5));
				rooms.add(facility);
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
		return rooms;
	}
	
	// Return a Fitness center
	public FitnessCenter getCenter (int centerId) {
		Connection conn = DBConnection.getConnection();
		FitnessCenter center = new FitnessCenter();
		String query = "SELECT * FROM fitness_centre"
				+ " WHERE centre_id = ? ";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, centerId);
			ResultSet result = stmt.executeQuery();
			while (result.next()) {
				center.setCenterId(result.getInt(1));
				center.setCenterName(result.getString(2));
				center.setCenterStreet(result.getString(3));
				center.setCenterTown(result.getString(4));
				center.setCenterPost(result.getString(5));
				center.setCenterPhoneNumber(result.getString(6));
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
		return center;
	}
	
	public String addFacility(Facility facility) {
		Connection conn = DBConnection.getConnection();
		String query = "INSERT INTO facility (centre_id, facilty_name, facility_desc, facility_capacity) VALUES (?,?,?,?)";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, facility.getCenterId());
			stmt.setString(2, facility.getFacilityName());
			stmt.setString(3, facility.getFacilityDescription());
			stmt.setInt(4, facility.getFacilityCapacity());
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to add facility!";
		}
		return "facility added successfully";
	}
	
	public String deleteFacility(int centerId, int facilityRoom) {
		Connection conn = DBConnection.getConnection();
		String query = "DELETE FROM facility"
				+ " WHERE centre_id = ? AND facility_room_numb = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, centerId);
			stmt.setInt(2, facilityRoom);
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return "Something went wrong! Unable to delete facility!";
		}
		return "Facility deleted successfully";
	}
}
