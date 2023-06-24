
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Operacoes {
       
    public static Scanner teclado = new Scanner(System.in);
    
    public static double Soma(double valor1, double valor2){
      return valor1 + valor2;
    }

    public static double Subtrair(double valor1, double valor2){
      return valor1 - valor2;
    }
    
    public static double Multicar(double valor1, double valor2) {
      return valor1 * valor2;
   
    }
    
   public static double Dividir(double valor1, double valor2){
     return valor1 / valor2;
    
   
   } 
   
   public static double max(double[]vetor){
   
      double max = 0;
   
    for(int i = 0; i < vetor.length;i++){
        
        if(vetor[i] > max){
            max = vetor[i];
        }
    }
        return max;
   }
   
 
   public static double min(double[]vetor){
       
       double min =vetor[0];
       
     for(int i =0; i < vetor.length; i ++){
       
       if(vetor[i] < min && vetor[i] != 0){
           min = vetor[i];
       }
    }   
      return min;
   }
   
   
   boolean soma() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}







