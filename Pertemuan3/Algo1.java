/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author Ripa'i
 */

import java.util.Scanner;
public class Algo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,x,y;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Angka : ");
        a=scan.nextInt();    
        x=1;
        y=x*x;
        while(y!=a){
        x++;
        y=x*x;     
    }
        
        System.out.print("Akar : "+x);
        
    }
    
}
