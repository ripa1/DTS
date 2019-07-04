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
public class Algo2 {
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Input sebuah bilangan : ");
        a=scan.nextInt();
        if (a % 2 == 1) {
            System.out.println(a+" Adalah bilangan ganjil ");
        }
        else
            System.out.println(a+" Adalah bilangan genap ");
    }
}
