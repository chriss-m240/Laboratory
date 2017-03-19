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
public class Restaurant {

    private Inventary inventary;
    private Worker[] workers;
    private Spending[] spendings;
    private Sale[] sales;
    private int nSpendings;
    private int nSales;
    private int nWorkers;
    private int nGroceries;

    Scanner sc = new Scanner(System.in);

    public Restaurant() {
        System.out.println("Enter the number of workers you have or want to have");
        this.nWorkers = sc.nextInt();
        this.workers = new Worker[nWorkers];
        this.nWorkers = 0;
        this.inventary = new Inventary();
        this.spendings = new Spending[20];
        this.sales = new Sale[20];
    }

    public void addSpending() {
        this.spendings[this.nSpendings] = new Spending();
        this.nSpendings += 1;
    }

    public void addSale() {
        this.sales[this.nSales] = new Sale();
        this.nSales += 1;

    }

    public void addWorker() {
        this.workers[this.nWorkers] = new Worker();
        this.nWorkers += 1;
    }

    public void removeWorker(String w) {
        for (int i = 0; i < this.nWorkers; i++) {
            if (this.workers[i].getName().equals(w)) {
                this.workers[i] = null;
            }

        }
        this.nWorkers--;
    }

    public Spending[] getSpendings() {
        return spendings;
    }

    public Sale[] getSales() {
        return sales;
    }

    public double getProfits(String type, int S) {
        double profits;
        double s = 0;
        double st = 0;

        for (int i = 0; i < nSales; i++) {

            if (this.sales[i].getDate().getDate(type) == S) {
                System.out.println(this.sales[i].getSales());
                s += this.sales[i].getSales();
            }
        }

        for (int i = 0; i < nSpendings; i++) {

            if (this.spendings[i].getDate().getDate(type) == S) {
                System.out.println(this.spendings[i].getValue());
                st += this.spendings[i].getValue();

            }
        }
        double w = 0;
        for (int i = 0; i < nWorkers; i++) {
            w += this.workers[i].getSalary();

        }
        profits = s - st - w;
        return profits;
    }

    public void addGrocery() {
        this.inventary.getGroceries()[this.nGroceries] = new Grocery();
        this.nGroceries++;
        System.out.println(this.nGroceries);
    }

    public void listInventary() {
        this.inventary.listInventary();
    }

    public void listWorkers() {
        for (int i = 0; i < this.nWorkers; i++) {
            System.out.println(this.workers[i]);
        }

    }

    public void removeGrocery(String grocery) {

        for (int i = 0; i < this.nGroceries; i++) {
            if (this.inventary.getGroceries()[i].getName().equals(grocery)) {

                this.inventary.getGroceries()[i] = null;
            }

        }
        this.inventary.removeGrocery();
    }
}
