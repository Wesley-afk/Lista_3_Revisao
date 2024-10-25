/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista3_11;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Lista3_11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = 0;
        
        System.out.println("deseja inserir quantos valores?");
        a = ler.nextInt();      
        
        ArrayList <Integer> array = new ArrayList <>();
        
        System.out.println("Insira " + a + " valores.");
        for (int i = 0; i < a; i++) {
             array.add(ler.nextInt());
        }
        
        int maior = Collections.max(array);
        int menor = Collections.min(array);
        
        System.out.println("Maior valor = " + maior + " Menor valor = " + menor);
      
  }
}
