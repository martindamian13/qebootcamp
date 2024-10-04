# qebootcamp

**"Features"**
1. Added task 1 and task 2 from Java basics for automation course.

## Task 1: Employee Record

### Description

The `EmployeeRecordApp` stores the following employee information:
- First Name
- Last Name
- Age (between 0 and 100)
- Employee Number (between 27560000 and 27569999)
- Email (generated based on first and last name)

### How It Works

The email is automatically generated in the format `firstname.lastname@mentormarkers.com`.

### Example:

```bash
Enter first name: John
Enter last name: Smith
Enter age (0-100): 30
Enter employee number (1-9999): 1
```

**Output:**
```
First Name: John
Last Name: Smith
Age: 30
Employee Number: 27560001
Email: john.smith@mentormarkers.com
```

### How to Run the Employee Record Program

1. Open the project in IntelliJ.
2. Navigate to the `Main.java` file in the `com.mentormarkers` package.
3. Run the `Main` class.
4. Enter the required details when prompted.

---

## Task 2: Lease Payment Calculator

### Description

The `LeaseCalculator` program calculates the monthly payment of a lease based on the following inputs:
- Total Leased Money
- Down Payment
- Lease Term (in months)
- Interest Rate (as a percentage)

### Formula

The monthly payment is calculated using the following formula:

```
monthlyPayment = ((totalLeasedMoney - downPayment) 
                  + ((totalLeasedMoney - downPayment) * (interestRate / 100)))
                  / monthsLeaseTerm
```

### Example:

```bash
Enter the total leased money: 25000
Enter the down payment: 5000
Enter the lease term in months: 48
Enter the interest rate (in percentage): 2.5
```

**Output:**
```
The monthly lease payment is: 427.08
```

### How to Run the Lease Payment Calculator

1. Open the project in IntelliJ.
2. Navigate to the `LeaseCalculator.java` file in the `com.leasecalculator` package.
3. Run the `LeaseCalculator` class.
4. Enter the required details when prompted.

---

## Prerequisites

- Java 17
- IntelliJ IDEA (or any other IDE that supports Java development)

