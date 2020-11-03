package application;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<HourContract> list = new ArrayList<>();

		System.out.println("Enter departament's name");
		String departament = sc.nextLine();

		System.out.println("Enter Worker data:");

		System.out.println("Name:");
		String name = sc.nextLine();

		System.out.println("Level:");
		String level = sc.nextLine();

		WorkerLevel wLevel = WorkerLevel.valueOf(level);

		System.out.println("Base salary:");
		Double salary = sc.nextDouble();

		Worker worker = new Worker(name, wLevel, salary, new Departament(departament));

		System.out.println("How many contracts to this worker?:");
		int qnt = sc.nextInt();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		for (int i = 0; i < qnt; i++) {
			System.out.println("Enter contract #" + (i + 1) + " data:");
			
			System.out.println("Date (DD/MM/YYYY):");
			Date contractDate = sdf.parse(sc.next());

			System.out.println("Value per hour:");
			Double valuePerHour = sc.nextDouble();

			System.out.println("Duration:");
			int hours = sc.nextInt();

			//Date date = new Date(format.parse(dateString).getTime());

			HourContract hourcontract = new HourContract(contractDate, valuePerHour, hours);
			list.add(hourcontract);

		}
		
		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/YYYY):");
		String dateString = sc.next();
		int intMonth = Integer.parseInt(dateString.substring(0, 2));
		int intYear = Integer.parseInt(dateString.substring(3));

		System.out.println("Name: " + worker.getName());
		System.out.println("Departamet: " + worker.getDepartament().getName());
		System.out.print("Income for " + dateString + ": " + String.format("%.2f", worker.income(intYear, intMonth)));
		
	}

}
