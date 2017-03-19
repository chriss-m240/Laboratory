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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome, we are going to create your restaurant");
        Restaurant paisa = new Restaurant();

        int option;

        do {

            System.out.println("Enter the number of the action that you want to do:");
            System.out.println("1.Add worker");
            System.out.println("2.Add grocery to your inventory");
            System.out.println("3.Add sale");
            System.out.println("4.Add spending");
            System.out.println("5.Get profits");
            System.out.println("6.List inventory");
            System.out.println("7.List workers");
            System.out.println("8. Remove grocery");
            System.out.println("9.Remove worker");
            System.out.println("10.Exit");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    paisa.addWorker();
                    break;
                case 2:
                    paisa.addGrocery();
                    break;
                case 3:
                    paisa.addSale();
                    break;
                case 4:
                    paisa.addSpending();
                    break;
                case 5:
                    String type;
                    int S;
                    System.out.println("Enter the type of profit that you want to get");
                    type = sc.next();
                    System.out.println("Enter the especific date tah you want");
                    S = sc.nextInt();
                    System.out.println(paisa.getProfits(type, S));
                    break;
                case 6:
                    paisa.listInventary();
                    break;
                case 7:
                    paisa.listWorkers();
                    break;
                case 8:
                    System.out.println("Enter the name of the grocery that you want to remove");
                    String grocery;
                    grocery = sc.next();
                    paisa.removeGrocery(grocery);
                    break;
                case 9:
                    String w;
                    System.out.println("Enter the name of the employee that you want to un-register");
                    w = sc.next();
                    paisa.removeWorker(w);
                    break;
                case 10:
                    break;
            }
        } while (option != 10);

    }
}
