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
public class Spending {

    private String type;
    private Date date;
    private String description;
    private double value;

    Scanner sc = new Scanner(System.in);

    public Spending() {
        System.out.println("Enter the type of the spending");
        this.type = sc.next();
        this.date = new Date();
        System.out.println("Enter the description of the spending");
        this.description = sc.next();
        System.out.println("Enter the value of the spending");
        this.value = sc.nextDouble();
    }

    public double getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }
}
