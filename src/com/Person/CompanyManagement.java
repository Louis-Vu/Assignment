package com.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyManagement {

    private static List<person> list = new ArrayList<person>();
    private static person person;
    public static void runMainMenu() {

        Scanner scanner = new Scanner(System.in);

        mainMenuLoop: while (true) {
            System.out.println();
            System.out.println("==========");
            System.out.println("1. Create New Personnel");
            System.out.println("2. Show all personnel");
            System.out.println("3. Search for personnel by ID");
            System.out.println("4. Update personnel information");
            System.out.println("5. See the salary of personnel");
            System.out.println("6. Salary update for personnel");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1 - 7): ");
            int selectedMenu = Integer.parseInt(scanner.nextLine());
            switch (selectedMenu) {
                case 1 -> {
                    createNewPerson();
                }
                case 2 -> {
                    displayAllPeople();
                }
                case 3 -> {
                    findPerson();
                }
                case 4 -> {
                    updatePerson();
                }
                case 5 -> {
                    checkSalary();
                }
                case 6 -> {
                    updateSalary();
                }
                case 7 -> {
                    break mainMenuLoop;
                }
            }
        }
    }

    private static void createNewPerson() {
        Scanner scanner = new Scanner(System.in);
        int selectedMenu = 0;
        createNewPersonLoop: while (true) {
            System.out.println();
            System.out.println("===== Create new personnel =====");
            System.out.println("1. Director");
            System.out.println("2. Manager");
            System.out.println("3. Employee");
            System.out.print("You want to give you any other (1 - 3, or a Q to return to the page): ");
            try {
                selectedMenu = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                break createNewPersonLoop;
            }
            switch (selectedMenu) {
                case 1 -> {
                    person = new Director();
                }
                case 2 -> {
                    person = new Manager();
                }
                case 3 -> {
                    person = new Employee();
                }
            }
            person.input();
            list.add(person);
        }

    }

    private static void displayAllPeople() {
        System.out.println("Showing " + list.size());
        for (person person : list) {
            person.display();
        }
    }

    private static void findPerson() {
        Scanner scanner = new Scanner(System.in);
        findPersonLoop: while (true) {
            System.out.println();
            int id;
            System.out.print("Enter the ID of the person you want to search (or press Q to go back):: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                break findPersonLoop;
            }
            person result = findPersonById(id);
            if (result != null) {
                System.out.print("Found 1 result: ");
                result.display();
            } else {
                System.out.println("No result is found");
            }
        }

    }

    private static person findPersonById(int id) {
        for (person person : list) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    private static void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        findPersonLoop: while (true) {
            System.out.println();
            int id;
            System.out.print("Enter the ID of the personnel you want to update (or press Q to go back): ");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                break findPersonLoop;
            }
            person result = findPersonById(id);
            if (result != null) {
                System.out.print("Found 1 result: ");
                result.display();
                result.updatePerson();
            } else {
                System.out.println("No result is found");
            }
        }
    }

    private static void checkSalary() {
        Scanner scanner = new Scanner(System.in);
        findPersonLoop: while (true) {
            System.out.println();
            int id;
            System.out.print("Enter the ID of the person you want to see the amount (or press Q to go back): ");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                break findPersonLoop;
            }
            person result = findPersonById(id);
            if (result != null) {
                System.out.print("Found 1 result: ");
                result.display();
            } else {
                System.out.println("No result is found");
            }
        }
    }

    private static void updateSalary() {
        Scanner scanner = new Scanner(System.in);
        findPersonLoop: while (true) {
            System.out.println();
            int id;
            System.out.print("Enter the ID of the employee you want to update salary (or press Q to go back): ");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                break findPersonLoop;
            }
            person result = findPersonById(id);
            if (result != null) {
                System.out.print("Found 1 result: ");
                result.display();
                result.updateSalary();
            } else {
                System.out.println("No result is found");
            }
        }
    }
}