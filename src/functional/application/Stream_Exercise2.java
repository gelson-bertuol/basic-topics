package functional.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import functional.entities.Employee;

public class Stream_Exercise2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		System.out.print("Enter salary: ");
		Double baseSalary = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			//Mostrar em ordem alfabética o email dos funcionários com salário maior que o lido.
			Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);
			List<String> emails = list.stream()
					.filter(e -> e.getSalary() > baseSalary)
					.map(e -> e.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", baseSalary));
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
					
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
