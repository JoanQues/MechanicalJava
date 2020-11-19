package com.mechanical;

public class Worker extends Person {
	private int hourSalary;
	Enum<WorkerCategory> category;
	
	public Worker(String dni, String name, String surnames, String email, int phone, int hourSalary,
			Enum<WorkerCategory> category) {
		super(dni, name, surnames, email, phone);
		this.hourSalary = hourSalary;
		this.category = category;
	}

	public Worker(String dni, String name, String surnames, String email, int phone) {
		super(dni, name, surnames, email, phone);
	}

	public int getHourSalary() {
		return hourSalary;
	}

	public void setHourSalary(int hourSalary) {
		this.hourSalary = hourSalary;
	}

	public Enum<WorkerCategory> getCategory() {
		return category;
	}

	public void setCategory(Enum<WorkerCategory> category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Worker [hourSalary=" + hourSalary + ", category=" + category + ", getDni()=" + getDni() + ", getName()="
				+ getName() + ", getSurnames()=" + getSurnames() + ", getEmail()=" + getEmail() + ", getPhone()="
				+ getPhone() + "]";
	}
	
	
	
}
