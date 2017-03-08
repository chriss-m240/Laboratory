/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise4;

/**
 *
 * @author chris
 */
import becker.robots.*;
import java.util.*;


public class Data {
    private int nRows;
    private int[] nColumns;
    private int TColumns;

    public Data() {
        this.TColumns = 0;
    }
    
    
    public void getData(City c){
        Scanner sc = new Scanner(System.in);
        int nR;
        
        System.out.println("Please enter the number of rows:");
        nR = sc.nextInt();
        this.nRows = nR;
        this.nColumns = new int[this.nRows];
        
        for (int i = 0; i < nRows; i++) {
            System.out.println("Please enter the number of columns:");
            this.nColumns[i] = sc.nextInt();
            this.TColumns += this.nColumns[i];
            
        } 
        
        Thing data[] = new Thing[this.nRows];
        for (int i = 0; i < data.length; i++) {
            data[i] = new Thing(c,i+1,1);
        }
    }
    
    public int[] getnColumns(){
        return this.nColumns;
    }
    
    public int getTColumns(){
        return this.TColumns;
    }
    
   
    
}
