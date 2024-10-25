/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista3_10;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;
/**
 *
 * @author wpass
 */

public class Lista3_10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0;
        int results [] = new int [5];
        
        System.out.println("Numero de clientes participantes da pesquisa");
        num = ler.nextInt();
        
        int[] clientesParticipantes = new int [num];
        int[] Gen = new int [num];
        
        for (int i = 0; i < num; i++) {
          System.out.println("Cliente " + (i + 1) + " Digite seu genero de filme favorito.");
          System.out.println(" 1 - Acao \n 2 - Comedia \n 3 - Drama \n 4 - Suspense \n 5 - Misterio");
          Gen[i] = ler.nextInt();
           System.out.println("\n \n ");
        }
        
        for (int i = 0; i < num; i++) {
            if(Gen[i] == 1){ 
               results[0] = results[0] + 1;
         }
            else if(Gen[i] == 2){
                results[1] = results[1] + 1;
            }
             else if(Gen[i] == 3){
                results[2] = results[2] + 1;
            }
            else if(Gen[i] == 4){
                results[3] = results[3] + 1;
            }
            else if(Gen[i] == 5){
                results[4] = results[4] + 1;
            }
       }
        String message = "Resultados da pesquisa : \n" + 
        "O genero acao foi escolhido por " + results[0] + " clientes \n" +
        "O genero Comedia foi escolhido por " + results[1] + " clientes \n" +
        "O genero Drama foi escolhido por " + results[2] + " clientes \n" + 
        "O genero Suspense foi escolhido por " + results[3] + " clientes \n" +
        "O genero Misterio foi escolhido por " + results[4] + " clientes \n" ;
        
         // System.out.println("A mensagem foi criada: " + message);
         JOptionPane.showMessageDialog(null,message);
         
        try {
            salvarResultados(message);
        } catch (IOException ex) {
            Logger.getLogger(Lista3_10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }       
         public static void salvarResultados (String message) throws IOException{
             FileWriter writer = new FileWriter("Resultados_Pesquisa.txt");
             writer.write(message);
             writer.close();
         }
    }