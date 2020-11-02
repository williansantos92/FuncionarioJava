package entities;

import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Departament departament;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	private void addContract(HourContract contract) {
		contracts.add(contract);

	}

	private void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	private Double income(Integer year, Integer month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();

		for (HourContract x : contracts) {

			Date d = x.getDate();
			cal.setTime(d);
			int ano = cal.get(Calendar.YEAR);
			int mes = 1+cal.get(Calendar.MONTH);

			if (year == ano && month == mes) {
				sum += x.totalValue();
			}
		}

		return sum;

	}

}
