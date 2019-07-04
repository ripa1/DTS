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
public class Algo3 {
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 3.14;
        double r,kl,ls;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Input sebuah bilangan : ");
        r=scan.nextDouble();
        kl=2*a*r;
        System.out.println("Luas Lingkaran : "+kl);
        ls=a*r*r;
        System.out.println("Luas Luas : "+ls);
    }
}
