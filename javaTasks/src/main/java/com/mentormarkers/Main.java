package com.mentormarkers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter age (0-100): ");
        int age = scanner.nextInt();

        System.out.print("Enter employee number (0-9999): ");
        int employeeNumber = scanner.nextInt();

        Employee employee = new Employee(firstName, lastName, age, employeeNumber);
        employee.displayEmployeeInfo();

    }
}
