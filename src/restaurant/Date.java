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
public class Date {

    private int day;
    private int month;
    private int year;

    Scanner sc = new Scanner(System.in);

    public Date() {
        System.out.println("Enter the day");
        this.day = sc.nextInt();
        System.out.println("Enter the month");
        this.month = sc.nextInt();
        System.out.println("Enter the year");
        this.year = sc.nextInt();
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDate(String type) {

        if ("day".equals(type)) {
            return this.day;
        }

        if ("month".equals(type)) {
            return this.month;
        }

        if ("year".equals(type)) {
            return this.year;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Date{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }

}
