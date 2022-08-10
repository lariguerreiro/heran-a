package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>();
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced? (y/n): ");
			char isOutsourced = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value Per Hour: ");
			double valuePerHour = sc.nextDouble();
			if(isOutsourced == 'n') {
				employees.add(new Employee(name, hours, valuePerHour));
			} else if(isOutsourced == 'y') {
				System.out.print("Additional charge: ");
				double addCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		
		sc.close();

	}

}
