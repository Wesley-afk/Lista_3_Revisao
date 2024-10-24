/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String array[];
        array = new String [3];
        
        array[0] = "Microondas";
        array[1] = "Relogio";
        array[2] = "Pendrive";
        
        System.out.println("Digite o codigo");
        int a = ler.nextInt();
        
        if(a < array.length && a > -1){
        System.out.println("O codigo digitado corresponde ao produto: " + array[a]);
        }
        else{
            System.out.println("Nao encontrado"); 
        }
    }
}
