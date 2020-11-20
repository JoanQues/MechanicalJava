package pureJava;

import java.time.LocalDate;

import com.evolution.*;

public class App {

	public static void main(String[] args) {
		Client client1 = new Client("45688747K","Pepe","Suarez","pepes@gmail.com",685748574,123L,true);
		Worker worker1 = new Worker("45655874L","Carlos","Dominguez","cdom@gmail.com",685745857,7,WorkerCategory.JUNIOR);
		Worker worker2 = new Worker("45857874Y","Jhon","Iglesias","jig@gmail.com",696585748,7,WorkerCategory.SENIOR);
		Worker worker3 = new Worker("96857485K","Gema","Saez","gsaez@gmail.com",675719077,7,WorkerCategory.MASTER);
		Vehicle veh1 = new Vehicle("4949JZF","Renault Clio",LocalDate.of(2017, 12, 20),client1);
		Breakdown brk1 = new Breakdown(1,"Fallo motor","Falla el motor al arrancar",300.50,SeverityType.MIDDLE,worker3,veh1);
		//int id, boolean paid, LocalDate date, Vehicle vehicle
		Invoice inv1 = new Invoice(123,false,LocalDate.of(2020, 01, 01));
		inv1.getBreackdownList().add(brk1);
	}
}