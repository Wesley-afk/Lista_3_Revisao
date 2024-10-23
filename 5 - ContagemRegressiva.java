/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject11;

import java.util.Scanner;

/**
 *
 * @author w.rocha
 */
public class Mavenproject11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = 0;
        
        System.out.println("Tempo da contagem regressiva:");
        a = read.nextInt();
        
        for (int i = a; a == 0; i--) {
            System.out.println(a);
        }
    }
}