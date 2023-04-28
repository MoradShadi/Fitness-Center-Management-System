package Database;

import java.util.ArrayList;
import java.util.List;

import entity.Facility;
import entity.FitnessCenter;

public class FitnessCenterSql {

	// Return "Center added successfully" or " Something went wrong..." 
	public String addCenter (FitnessCenter center) {
		return "";
	}
	
	// Return "Center updated successfully" or " Something went wrong..." 
	public String UpdateCenter (FitnessCenter center) {
		return "";
	}
	
	// Return "Center deleted successfully" or " Something went wrong..." 
	public String deleteCenter (FitnessCenter center) {
		return "";
	}
	
	// Return a list of Centers
	public List<FitnessCenter> getAllCenters () {
		List<FitnessCenter> centers = new ArrayList<FitnessCenter>();
	
		return centers;
	}

	// Return a list of Facility rooms
	public List<Facility> getAllrooms () {
		List<Facility> rooms = new ArrayList<Facility>();
	
		return rooms;
	}
	
	// Return a Fitness center
	public FitnessCenter getStaff (int centerId) {
		FitnessCenter center = new FitnessCenter();
		return center;
	}
	
	public String addFacility(Facility facility) {
		return "";
	}
	
	public String deleteFacility(Facility facility) {
		return "";
	}
}
