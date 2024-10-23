/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediadetresnumeros;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class Mediadetresnumeros {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        
        System.out.println("Digite a nota de desempenho do funcionario 1");
        a = ler.nextInt();
        
        System.out.println("Digite a nota de desempenho do funcionario 2");
        b = ler.nextInt();
        
        System.out.println("Digite a nota de desempenho do funcionario 3");
        c = ler.nextInt();
        
        System.out.println("media do desempenho = " + (a + b + c) / 3);
    }
}
