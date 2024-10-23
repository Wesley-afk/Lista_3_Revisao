/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadadeumnumero;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = 0;
        
        System.out.println("Digite um numero.");
        a = ler.nextInt();
        
        System.out.println(" \n Tabuada do numero: " + a);
        for(int c = 1; c <= 10; c++){
            System.out.println(a * c);
        }
    }
}
