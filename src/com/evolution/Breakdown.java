package com.evolution;

public class Breakdown {
	private int id;
	private	String name;
	private String description;
	private double price;
	private Enum<SeverityType>severity;
	private Worker mechanic;
	private Vehicle vehicle;
	
	public Breakdown(int id, String name, String description, double price, Enum<SeverityType> severity,
			Worker mechanic, Vehicle vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.severity = severity;
		this.mechanic = mechanic;
		this.vehicle = vehicle;
	}

	public Breakdown() {
	}
	
	

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Enum<SeverityType> getSeverity() {
		return severity;
	}

	public void setSeverity(Enum<SeverityType> severity) {
		this.severity = severity;
	}

	public Worker getMechanic() {
		return mechanic;
	}

	public void setMechanic(Worker mechanic) {
		this.mechanic = mechanic;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Breakdown other = (Breakdown) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Breakdown [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", severity=" + severity + ", mechanic=" + mechanic + ", vehicle=" + vehicle + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getDescription()=" + getDescription() + ", getPrice()=" + getPrice()
				+ ", getSeverity()=" + getSeverity() + ", getMechanic()=" + getMechanic() + "]";
	}


	
	
	
}
