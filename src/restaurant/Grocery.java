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
public class Grocery {

    private String name;
    private Date date;

    Scanner sc = new Scanner(System.in);

    public Grocery() {

        System.out.println("Enter the name of your new grocery");
        this.name = sc.next();
        this.date = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Grocery{" + "name=" + name + ", date=" + date + '}';
    }

}
