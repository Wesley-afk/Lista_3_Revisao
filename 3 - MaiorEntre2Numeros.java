/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaderevisao3;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class ListaDeRevisao3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = 0;
        int b = 0;
        
        System.out.println("Digite a pontuacao do primeiro jogador:");
        a = read.nextInt();
        
        System.out.println("Digite a pontuacao do segundo jogador");
        b = read.nextInt();
        
        if(a > b){
            System.out.println("O jogador A venceu a partida");
    }
        else{
            System.out.println("O jogador B venceu a partida");
        }
    }
}
