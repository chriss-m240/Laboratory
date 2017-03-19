/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Worker {

    private String name;
    private String role;
    private double Salary;

    Scanner sc = new Scanner(System.in);

    public Worker() {
        System.out.println("Enter the name of your employee");
        this.name = sc.next();
        System.out.println("Enter the roler of the new employee");
        this.role = sc.next();
        System.out.println("Enter the value of the employee's salary");
        this.Salary = sc.nextDouble();
    }

    public double getSalary() {
        return this.Salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Worker{" + "name=" + name + ", role=" + role + ", Salary=" + Salary + '}';
    }

}
