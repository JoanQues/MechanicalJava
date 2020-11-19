package com.mechanical;

public class WebUser extends Client {
	private String username;
	private String password;
	
	public WebUser(String dni, String name, String surnames, String email, int phone, long clientId, boolean premium,
			String username, String password) {
		super(dni, name, surnames, email, phone, clientId, premium);
		this.username = username;
		this.password = password;
	}

	public WebUser(String dni, String name, String surnames, String email, int phone, long clientId, boolean premium) {
		super(dni, name, surnames, email, phone, clientId, premium);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "WebUser [username=" + username + ", password=" + password + ", getClientId()=" + getClientId()
				+ ", isPremium()=" + isPremium() + ", toString()=" + super.toString() + ", getName()=" + getName()
				+ ", getSurnames()=" + getSurnames() + ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone()
				+ "]";
	}
	
	
}
