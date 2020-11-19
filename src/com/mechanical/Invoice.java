package com.mechanical;

import java.time.LocalDate;
import java.util.List;

public class Invoice {
	private int id;
	private List<Breakdown>breackdownList;
	private boolean paid;
	private LocalDate date;
	
	public Invoice(int id, List<Breakdown> breackdownList, boolean paid, LocalDate date) {
		super();
		this.id = id;
		this.breackdownList = breackdownList;
		this.paid = paid;
		this.date = date;
	}

	public Invoice() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Breakdown> getBreackdownList() {
		return breackdownList;
	}

	public void setBreackdownList(List<Breakdown> breackdownList) {
		this.breackdownList = breackdownList;
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
		return "Invoice [id=" + id + ", breackdownList=" + breackdownList + ", paid=" + paid + ", date=" + date + "]";
	}
	
	
}
