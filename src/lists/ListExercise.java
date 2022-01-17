package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import lists.entities.Employee;

public class ListExercise {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered: ");
		int quantity = sc.nextInt();
		System.out.println();
		
		for (int i=0; i<quantity; i++) {
			System.out.println("Employee #" + (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(employees, id)) {
				System.out.print("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		/* RESOLVENDO COM PREDICADO *****/
		/*
		Employee empTemp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (empTemp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			empTemp.increaseSalary(percentage);
		}
		*/
		
		/* RESOLVENDO ACHANDO A POSIÇÃO NA LISTA *****/
		Integer position = getPosition(employees, id);
		if (position == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employees.get(position).increaseSalary(percentage);
		}
		
		System.out.println();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		sc.close();
	}
	
	private static Integer getPosition(List<Employee> list, int id) {
		for (Employee iten : list) {
			if (iten.getId() == id) return list.indexOf(iten);
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
