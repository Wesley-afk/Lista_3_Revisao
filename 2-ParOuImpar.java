/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parimpar;

import java.util.Scanner;

/**
 *
 * @author w.rocha
 */
public class ParImpar {

    public static void main(String[] args) {
  Scanner read = new Scanner(System.in);
        int a = 0;
        
        System.out.println("usuario, digite um numero");
        a = read.nextInt();
        
        if( a % 2 == 0){
            System.out.println("O numero e par");
        }
        else{
            System.out.println("O numero e impar");
        }    
    }
}
