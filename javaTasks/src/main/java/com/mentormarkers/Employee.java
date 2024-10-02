package com.mentormarkers;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private int employeeNumber;
    private String email;

    // Constructor
    public Employee(String firstName, String lastName, int age, int employeeNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setEmployeeNumber(employeeNumber);
        setEmail(firstName, lastName);
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber + 27560000;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String firstName, String lastName) {
        this.email = generateEmail(firstName, lastName);
    }

    // Method to generate email address
    public String generateEmail(String firstName, String lastName) {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@mentormakers.com";
    }

    // Method to display employee information
    public void displayEmployeeInfo() {
        // Use getters to access private fields
        System.out.println("Employee Information:");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Employee Number: " + getEmployeeNumber());
        System.out.println("Email: " + getEmail());  // Email is already generated
    }
}