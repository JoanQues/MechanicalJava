package com.evolution;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
	private int id;
	private List<Breakdown>breackdownList;
	private boolean paid;
	private LocalDate date;
	private List<Breakdown> breakdownList;
	
	public Invoice(int id, boolean paid, LocalDate date) {
		super();
		this.id = id;
		this.paid = paid;
		this.date = date;
		this.breackdownList = new ArrayList<Breakdown>();
	}
	
	public double CalculateTotal() {
		double total = 0.0;
		boolean premium = false;
		if(this.breackdownList != null) {
			for (Breakdown br : this.breakdownList) {
				total += br.getPrice();
				if(br.getVehicle().getPropietary().isPremium()) {
					premium = true;
				}
			}
		}
		if(premium) {
			double iva = total * 0.05;
			total = total - iva;
		}
		return total;
	}
	
	public static double CalculateIVA(double price) {
		double total = 0.0;
		total = price * 0.21;
		return total;
	}
	
	public void AddBreakdown(Breakdown breakdown) {
		this.breackdownList.add(breakdown);
	}
	
	public Invoice() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public List<Breakdown> getBreakdownList() {
		return breakdownList;
	}

	public void setBreakdownList(List<Breakdown> breakdownList) {
		this.breakdownList = breakdownList;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
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
		Invoice other = (Invoice) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", breackdownList=" + breackdownList + ", paid=" + paid + ", date=" + date
				+ ", breakdownList=" + breakdownList + ", getId()=" + getId() + ", getBreakdownList()="
				+ getBreakdownList() + ", getBreackdownList()=" + getBreakdownList() + ", isPaid()=" + isPaid()
				+ ", getDate()=" + getDate() + "]";
	}


	


	
	
}
