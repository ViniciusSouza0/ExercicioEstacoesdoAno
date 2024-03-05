package com.mycompany.exerciciosswitchcase2;

import java.util.Scanner;

public class ExerciciosSwitchcase2 {

    public static void main(String[] args) {

Scanner teclado2 = new Scanner(System.in); 

int x;
String nome;


System.out.println("Escolha a estação:");
x = teclado2.nextInt();

switch(x){
case 1:
System.out.println("Verão");
break; 
        
case 2:
System.out.println("Inverno");
break;
        
case 3:
System.out.println("Primavera");
break;
        
case 4: 
System.out.println("Outono");
break;
        
default:
System.out.println("Estação não encontrada :(");
break;
  
}


    }
}
