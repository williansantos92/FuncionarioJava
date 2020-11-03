package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.enums.WorkerLevel;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		
		
		
		
		System.out.println("Level:");
		String level = sc.nextLine();
		
		WorkerLevel w = WorkerLevel.valueOf(WorkerLevel.class, sc.next());
		
		System.out.println(w);
		

	}

}
