/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class Lista_Revisao {
    // 1 - Soma de dois números

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int soma = a + b;
        
        System.out.println("Digite um número");
        a = read.nextInt();
        
        System.out.println("Digite outro número");
        b = read.nextInt();
      
        System.out.println(soma);
    }
}
