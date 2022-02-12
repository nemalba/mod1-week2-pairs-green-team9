package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Application {

    /**
     * The main entry point in the application
     * @param args
     */

    //Create an instance variable in the Application class called
    // departments to hold a List<Department>.
    public static List<Department> departments = new ArrayList<>();
    public static List<Employee> employees = new ArrayList<>();


    public static void main(String[] args) {

        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
             Department marketing = new Department(1, "Marketing");
            Department sales = new Department(2, "Sales");
            Department engineering = new Department(3, "Engineering");

            departments.add(marketing);
            departments.add(sales);
            departments.add(engineering);

    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {

        System.out.println("------------- DEPARTMENTS ------------------------------");

        for (int i = 0; i < departments.size(); i++) {
            System.out.println(departments.get(i).getName());
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private static void createEmployees() {
        /*
        Dean Johnson: Create this employee using the no-argument constructor
        and call setter methods to set each instance variable.
         */
        Employee dean = new Employee();
        dean.setEmployeeId(001);
        dean.setFirstName("Dean");
        dean.setLastName("Johnson");
        dean.setEmail("djohnson@teams.com");
        gets;


    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
