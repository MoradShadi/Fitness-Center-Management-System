package entity;

public class Role {
	
	private char roleId;
	private String roleName;
	
	public char getRoleId() {
		return roleId;
	}
	
	public void setRoleId(char roleId) {
		this.roleId = roleId;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public Role(char roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public Role() {}
	
}
