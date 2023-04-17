package com.Person;

import java.util.Scanner;

public abstract class person {

    private static int count = 0;
    protected int id;
    protected String name;
    protected double bonus;
    protected double salary;

    public person() {
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalary() {
        return salary;
    }

    public double getTotalSalary() {
        return bonus * salary + salary;
    }

    public abstract void input();
    public abstract void display();
    public abstract void updatePerson();
    public void updateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Update new Salary($): ");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.printf("Updated: New base salary = $%.2f%n", salary);
    }
}

class Director extends person {
    private String role;

    public Director() {
        super();
        bonus = 0.5;
    }

    public String getRole() {
        return role;
    }

    @Override
    public void input() {
        System.out.println("Create a Director.....");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter basis salary($): ");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter position: ");
        role = scanner.nextLine();
        System.out.print("Successfully created: ");
        display();
    }

    @Override
    public void display() {
            System.out.println("This is an Director");
            System.out.println("Name" + name);
            System.out.println("Basic salary" + salary);
        };

    @Override
    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Update name: ");
        name = scanner.nextLine();
        System.out.print("Update position: ");
        role = scanner.nextLine();
            System.out.print("Updated successfully: ");
        display();
    }
}

class Manager extends person {
    private String department;

    public Manager() {
        super();
        bonus = 0.3;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void input() {
        System.out.println("Create Manager........");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("enter basic salary($): ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the department: ");
        department = scanner.nextLine();
        System.out.print("Successfully created ");
        display();
    }

    @Override
    public void display() {
        System.out.println("This is an Director");
        System.out.println("Name" + name);
        System.out.println("Basic salary" + salary);
    }

    @Override
    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Update name: ");
        name = scanner.nextLine();
        System.out.print("Update the department: ");
        department = scanner.nextLine();
        System.out.print("Update successfully: ");
        display();
    }
}

class Employee extends person {
    private String skill;

    public Employee() {
        super();
        bonus = 0.1;
    }

    public String getSkill() {
        return skill;
    }



    @Override
    public void input() {
        System.out.println("Create Employee.......");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("enter basic salary($): ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter location: ");
        skill = scanner.nextLine();
        System.out.print("Successfully created ");
        display();
    }

    @Override
    public void display() {
        System.out.println("This is an Director");
        System.out.println("Name" + name);
        System.out.println("Basic salary" + salary);
    }
    @Override
    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Update name: ");
        String name = scanner.nextLine();
        System.out.print("Update location: ");
        skill = scanner.nextLine();
        System.out.print("Update successfully: ");
        display();
    }
}