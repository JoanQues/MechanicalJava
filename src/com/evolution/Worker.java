package com.evolution;

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
	
	public double CalculateSalary() {
		int hour = this.hourSalary;
		int baseSalary = hour * 8 * 5;
		double weekSalary = 0.0;
		
		if(this.category == WorkerCategory.JUNIOR) {
			weekSalary = baseSalary;
		}else if(this.category == WorkerCategory.SENIOR) {
			weekSalary = baseSalary * 1.20;
		}else {
			weekSalary = baseSalary * 1.50;
		}
		return weekSalary;
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
