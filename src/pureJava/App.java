package pureJava;

import java.time.LocalDate;

import com.evolution.*;

public class App {

	public static void main(String[] args) {
		Client client1 = new Client("45688747K","Pepe","Suarez","pepes@gmail.com",685748574,123L,true);
		WebUser wb1 = new WebUser("7485745454Y","Diana","Galindo","dgalin@gmail.com",685748574,456L,false,"dgalindo","1234");
		Worker worker1 = new Worker("45655874L","Carlos","Dominguez","cdom@gmail.com",685745857,7,WorkerCategory.JUNIOR);
		Worker worker2 = new Worker("45857874Y","Jhon","Iglesias","jig@gmail.com",696585748,7,WorkerCategory.SENIOR);
		Worker worker3 = new Worker("96857485K","Gema","Saez","gsaez@gmail.com",675719077,7,WorkerCategory.MASTER);
		Vehicle veh1 = new Vehicle("4949JZF","Renault Clio",LocalDate.of(2017, 12, 20),client1);
		Breakdown brk1 = new Breakdown(1,"Fallo motor","Falla el motor al arrancar",800.50,SeverityType.MIDDLE,worker3,veh1);
		Breakdown brk2 = new Breakdown(2,"Fallo escape","Falla el escape",150.70,SeverityType.LOW,worker1,veh1);
		Breakdown brk3 = new Breakdown(3,"Fallo neumaticos","Fallan los neumaticos",400.00,SeverityType.MIDDLE,worker2,veh1);
		//int id, boolean paid, LocalDate date, Vehicle vehicle
		Invoice inv1 = new Invoice(123,false,LocalDate.of(2020, 01, 01));
		
		System.out.println(wb1);
		inv1.AddBreakdown(brk1);
		inv1.AddBreakdown(brk2);
		inv1.AddBreakdown(brk3);
		
	}
}