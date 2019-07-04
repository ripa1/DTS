/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

import java.util.Scanner;

/**
 *
 * @author Ripa'i
 */
public class Algo4 {
   public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Input bilangan ke-1 : ");
        a=scan.nextInt();
        System.out.printf("Input bilangan ke-2 : ");
        b=scan.nextInt();
        if(a>b) {
            System.out.println("Bilangan ke-1 : "+a+" lebih besar dari bilangan ke-2 : "+b);
        }else if(a<b){
            System.out.println("Bilangan ke-1 : "+a+" lebih kecil dari bilangan ke-2 : "+b);
        }else if(a==b){
            System.out.println("Bilangan ke-1 : "+a+"sama dengan ke-2 : "+b);
        }
    } 
}
