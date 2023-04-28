package Database;

import java.util.ArrayList;
import java.util.List;

import entity.Member;

public class MemberSql {

	// Return "Member added successfully" or " Something went wrong..." 
	public String addMember (Member member) {
		return "";
	}
	
	// Return "Member updated successfully" or " Something went wrong..." 
	public String updateMember (Member member) {
		return "";
	}
	
	// Return "Member deleted successfully" or " Something went wrong..." 
	public String deleteMember (Member member) {
		return "";
	}
	
	// Return a list of Members
	public List<Member> getAllMembers () {
		List<Member> members = new ArrayList<Member>();
		return members;
	}
	
	// Return a Member
	public Member getMember (int memberId) {
		Member member = new Member();
		return member;
	}
}
