/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista3_14;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class Lista3_14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numFunc = 0;
        int resp = 0;
        String NomeFunc = "";
        int newSal = 0;
        
        System.out.println("Numero de funcionarios a serem cadastrados");
        numFunc = ler.nextInt();
        ler.nextLine();
        
        String nomeFunc[] = new String[numFunc];
        int SalFunc[] = new int[numFunc];
        
        System.out.println("Digite o nome dos funcionarios:");
        for (int i = 0; i < numFunc; i++) {
            nomeFunc[i] = ler.nextLine();
        }
        
        System.out.println("Digite o salario dos funcionarios:");
        for (int i = 0; i < numFunc; i++) {
            SalFunc[i] = ler.nextInt();
        }
        
        System.out.println("Deseja atualizar o salario de algum funcionario? \n 1 - Sim \n 2 - Nao");
        resp = ler.nextInt();
        ler.nextLine();
        
        if(resp == 1){
            System.out.println("Digite o Nome do funcionario.");
             NomeFunc = ler.nextLine();
             
              System.out.println("Digite o novo salario do funcionario");
               newSal = ler.nextInt();
               
               for (int i = 0; i < numFunc; i++) {
                if(NomeFunc.equals(nomeFunc[i])){
                    SalFunc[i] = newSal;
                }
            }
        }
        else{
            System.out.println("Programa encerrado");
        }
        
        String message = "Relacao funcionario e salario \n \n ";
         for (int i = 0; i < numFunc; i++) {
            message += "Nome  =  " + nomeFunc[i] + "  salario  =  " + SalFunc[i] + "\n \n";
        }
                JOptionPane.showConfirmDialog(null, message);
                PassandoParaTxT(message);
    }
    
     public static void PassandoParaTxT(String message){
        try {
            FileWriter writer = new FileWriter("Informações atualizadas");
            writer.write(message);
        } catch (IOException ex) {
            Logger.getLogger(Lista3_14.class.getName()).log(Level.SEVERE, null, ex);
        }
         
}
}
