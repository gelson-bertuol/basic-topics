package composition.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import composition.entities.Department;
import composition.entities.HourContract;
import composition.entities.Worker;
import composition.entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("	Name: ");
		String workerName = sc.nextLine();
		System.out.print("	Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("	Base Salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();

		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Enter contract #" + (i+1) + " data:");
			System.out.print("	Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("	Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("	Duration (hours): ");
			int hours = sc.nextInt();
			
			worker.addContract(new HourContract(contractDate, valuePerHour, hours));
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + worker.getName() + "\n");
		sb.append("Department: " + worker.getDepartment().getName() + "\n");
		sb.append("Income for " + monthAndYear + ": ");
		sb.append(String.format("%.2f", worker.income(year, month)));
		System.out.println(sb);
		
//		System.out.println("Name: " + worker.getName());
//		System.out.println("Department: " + worker.getDepartment().getName());
//		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}
}
