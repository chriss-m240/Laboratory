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
public class Sale {

    private Date date;
    private double value;
    private String description;

    Scanner sc = new Scanner(System.in);

    public Sale() {
        this.date = new Date();
        System.out.println("Enter the description of the sale");
        this.description = sc.next();
        System.out.println("Enter the value of the sale");
        this.value = sc.nextDouble();
    }

    public double getSales() {
        return this.value;
    }

    public Date getDate() {
        return date;
    }

}
