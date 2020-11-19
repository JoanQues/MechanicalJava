package com.mechanical;

public class Client extends Person {
	private long clientId;
	private boolean premium;
	
	public Client(String dni, String name, String surnames, String email, int phone, long clientId, boolean premium) {
		super(dni, name, surnames, email, phone);
		this.clientId = clientId;
		this.premium = premium;
	}

	public Client(String dni, String name, String surnames, String email, int phone) {
		super(dni, name, surnames, email, phone);
	}

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", premium=" + premium + ", getDni()=" + getDni() + ", getName()="
				+ getName() + ", getSurnames()=" + getSurnames() + ", getEmail()=" + getEmail() + ", getPhone()="
				+ getPhone() + "]";
	}
	
	
	
	
}
