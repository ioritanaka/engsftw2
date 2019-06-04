package Teste1;
import java.util.Scanner;

class Calculadora {  
    
	static double num1, num2, result;
	static Scanner numeros;
	
	public static void main (String args[]){  
        
        numeros = new Scanner(System.in);     
        char sinal;  
        double num1;  
        double num2;  
        double result;  
          
        char [] s = new char[4];  
          
        s[0] = '+';  
        s[1] = '-';  
        s[2] = '*';  
        s[3] = '/';  
          
        System.out.println("Digite o sinal da operação que deseja fazer: ");
        String aux = numeros.next();
        sinal = aux.charAt(0);
        
        switch(sinal){
     	   case'+':
     		   System.out.println(operMais());
     		   break;
     	   case'-':
     		   System.out.println(operMenos());
     		   break;
     	   case'*':
     		   System.out.println(operVezes());
     		   break;
     	   case'/':
     	   	   System.out.println(operDiv());
     	   	   break;
        }
              
    }
	
    static double operMais(){  
          
        System.out.println("Digite o primeiro valor para a operação");  
        num1 = numeros.nextDouble();  
        System.out.println("Digite o segundo valor para a operação");  
        num2 = numeros.nextDouble();  
        return (num1 + num2);  
    }  
      
    static double operMenos(){  
          
        System.out.println("Digite o primeiro valor para a operação");  
        num1 = numeros.nextDouble();  
        System.out.println("Digite o primeiro valor para a operação");  
        num2 = numeros.nextDouble();  
        return (num1 - num2);  
    }  
          
    static double operVezes(){  
        System.out.println("Digite o primeiro valor para a operação");  
        num1 = numeros.nextDouble();  
        System.out.println("Digite o primeiro valor para a operação");  
        num2 = numeros.nextDouble();  
        return (num1 * num2);  
    }     
      
    static double operDiv(){      
        System.out.println("Digite o primeiro valor para a operação");  
        num1 = numeros.nextDouble();  
        System.out.println("Digite o primeiro valor para a operação");  
        num2 = numeros.nextDouble();  
        return (num1 / num2);  
    } 
}  