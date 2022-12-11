package Motocycle;

import java.util.List;

public class Main {
	public static void main(String[] args){
		Garage garage = new Garage();
		Motorcycle moto1 = new Motorcycle.Builder( "BMW G 310 R",
				"AC6776BM",
				313,
				TransmissionType.MANUAL,
				2017,
				"Roman Mel'nyk")
				.setColor("red")
				.buidl();
		Motorcycle moto2 = new Motorcycle.Builder( "Yamaha XJ6",
				"AC6776BM",
				600,
				TransmissionType.AUTO,
				2013,
				"Olga Yakubiv")
				.setColor("yellow")
				.buidl();
		Motorcycle moto3 = new Motorcycle.Builder( "Honda CBR 250R",
				"AC6776BM",
				250,
				TransmissionType.MANUAL,
				2014,
				"Nazar Todoruk")
				.setColor("black")
				.buidl();
		garage.addMotorcycle(moto1);
		garage.addMotorcycle(moto2);
		garage.addMotorcycle(moto3);
		List<Motorcycle> ourMotorcycles = garage.getMotorcycleList();
		for(Motorcycle motorcycle :ourMotorcycles){
			System.out.println(motorcycle.toString() + "\n");
		}
	}
}
