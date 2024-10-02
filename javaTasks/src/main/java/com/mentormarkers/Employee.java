package com.mentormarkers;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private int employeeNumber;
    private String email;

    // Constructor
    public Employee(String firstName, String lastName, int age, int employeeNumber) {
        if (age < 0 || age > 100) {
            System.out.println("Age must be between 0 and 100");
        }
        if (employeeNumber < 0 || employeeNumber > 9999) {
            System.out.println("Employee number must be between 0 and 9999");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employeeNumber = employeeNumber + 27560000;
        this.email = generateemail(firstName, lastName);
    }

    // Method to generate email address
    public String generateemail(String firstName, String lastName) {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@mentormakers.com";
    }

    // Method to display employee information
    public void displayEmployeeInfo() {
        System.out.println("Employee Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Email: " + email);
    }
}