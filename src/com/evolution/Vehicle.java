package com.evolution;

import java.time.LocalDate;

public class Vehicle {
	private String matricula;
	private String brand;
	private LocalDate registratonDate;
	private String propietary;
	
	public Vehicle(String matricula, String brand, LocalDate registratonDate, String propietary) {
		super();
		this.matricula = matricula;
		this.brand = brand;
		this.registratonDate = registratonDate;
		this.propietary = propietary;
	}

	public Vehicle() {
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public LocalDate getRegistratonDate() {
		return registratonDate;
	}

	public void setRegistratonDate(LocalDate registratonDate) {
		this.registratonDate = registratonDate;
	}

	public String getPropietary() {
		return propietary;
	}

	public void setPropietary(String propietary) {
		this.propietary = propietary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Vehicle other = (Vehicle) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicle [matricula=" + matricula + ", brand=" + brand + ", registratonDate=" + registratonDate
				+ ", propietary=" + propietary + "]";
	}
	
	
	
	
}
