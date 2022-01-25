package polymorphism.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import polymorphism.entities.Employee;
import polymorphism.entities.OutsourcedEmployee;

public class Company {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>(); 
		
		System.out.print("Enter the number of employees: ");
		int numberEmployees = sc.nextInt();
		
		for (int i=0; i<numberEmployees; i++) {
			sc.nextLine();
			System.out.println("Employee #" + (i+1) + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char c = sc.nextLine().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if (c == 'y') {
				System.out.print("Additional charge: ");
				Double additional = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additional);
				employees.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				employees.add(emp);
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : employees) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}
}
