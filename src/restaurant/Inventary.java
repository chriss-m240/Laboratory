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
public class Inventary {

    Scanner sc = new Scanner(System.in);
    private Grocery[] groceries;
    private int nGroceries;

    public Inventary() {
        System.out.println("Enter the capacity of your storage");
        int n = sc.nextInt();
        this.nGroceries = 0;
        this.groceries = new Grocery[n];
    }

    public void addGrocery() {
        this.groceries[nGroceries] = new Grocery();
        System.out.println(nGroceries);
        this.nGroceries++;
    }

    public void removeGrocery() {
        this.nGroceries--;
    }

    public void listInventary() {

        for (Grocery grocerie : this.groceries) {
            System.out.println(grocerie);
        }
    }

    public Grocery[] getGroceries() {
        return groceries;
    }

    public int getnGroceries() {
        return nGroceries;
    }

}
