/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Main{
      public static void main(String args[]){   
       
        Operacoes biblioteca = new Operacoes();
        
       double Subtrair = biblioteca.Subtrair(123, 140);
     
       
      System.out.print("O valor da Subtração é:");
        
        System.out.print(biblioteca.Subtrair(123,140));
          
     
      System.out.print("           O valor da Adição é:");
        
        System.out.print(biblioteca.Soma(123,140));
        
        
      System.out.print("          O valor da Multiplicação é:");
        
        System.out.print(biblioteca.Multicar(2,4));
        
        
      System.out.print("           O valor da Divição é:");
        
        System.out.print(biblioteca.Dividir(6,3));
        
        double[] vetor = new double [10];
        
            vetor[0] = 242;
            vetor[1] = 345;
            vetor[2] = 450;
            vetor[3] = 378;
            vetor[4] = 1;
            vetor[5] = 67;
            vetor[6] = 34;
            vetor[7] = 11;
            vetor[8] = 12;
            vetor[9] = 906; 
            
         System.out.print("            O maior número é:");
           System.out.print(biblioteca.max(vetor));
           
           
           double[] vetor = new double [10];
        
            vetor[0] = 242;
            vetor[1] = 345;
            vetor[2] = 450;
            vetor[3] = 378;
            vetor[4] = 1;
            vetor[5] = 67;
            vetor[6] = 34;
            vetor[7] = 11;
            vetor[8] = 12;
            vetor[9] = 906;        
         System.out.print("            O menor número é:");
           System.out.print(biblioteca.min(vetor));
            
           
           
           
           
           
           
           
    	System.exit(0);
		
    }
}

