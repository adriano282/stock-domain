package domain;

public class User extends DomainEntity{
	
	private String username;
	private Integer hashCodePassword;
	private Boolean root;
	private Boolean ableEmail;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getHashCodePassword() {
		return hashCodePassword;
	}
	public void setHashCodePassword(Integer hashCodePassword) {
		this.hashCodePassword = hashCodePassword;
	}
	public boolean getRoot() {
		return root;
	}
	public void setRoot(Boolean root) {
		this.root = root;
	}
	public Boolean getAbleEmail() {
		return ableEmail;
	}
	public void setAbleEmail(Boolean availableReceiveEmail) {
		this.ableEmail = availableReceiveEmail;
	}
}
