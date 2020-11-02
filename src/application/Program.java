package application;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter departament's name");
		String depar = sc.nextLine();
		
		System.out.println("Enter Worker data:");
		
		System.out.println("Name:");
		String name = sc.nextLine();
		
		System.out.println("Level:");
		String level = sc.nextLine();
		
		//WorkerLevel w = WorkerLevel.valueOf(WorkerLevel.class, sc.next());
		
		System.out.println("Base salary:");
		Double salary = sc.nextDouble();
		
		System.out.println("How many contracts to this worker?:");
		int qnt = sc.nextInt();
		
		for(int i = 0 ; i<qnt ; i++) {
			System.out.println("Enter contract #" + (i+1) + " data:");
			
			System.out.println("Date (DD/MM/YYYY):");
			String dateString = sc.nextLine();
			
			System.out.println("Value per hour:");
			Double valuePerHour = sc.nextDouble();
			
			System.out.println("Duration:");
			int hours = sc.nextInt();
			
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date(format.parse(dateString).getTime());
						
			HourContract hourcontract = new HourContract(date, valuePerHour, hours);
		}
		
		
	}

}
