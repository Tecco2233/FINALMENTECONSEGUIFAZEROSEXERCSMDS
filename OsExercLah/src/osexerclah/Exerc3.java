/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osexerclah;

import java.util.*;

/**
 *
 * @author house
 */
public class Exerc3 {
     public static void main(String[] args) {

     Scanner aa = new Scanner(System.in);   
        System.out.println("Digite um numero equivalente a um dia da semana, de 0 a 6");
     int a = aa.nextInt();
     switch (a) {
         case 0 :
             System.out.println("Domingo");
             break;
         case 1 :
             System.out.println("Segunda");
             break;
         case 2 :
             System.out.println("Terça");
             break;
         case 3 :
             System.out.println("Quarta");
             break;
         case 4 :
             System.out.println("Quinta");
             break;
         case 5 :
             System.out.println("Sexta");
             break;
         case 6 :
             System.out.println("Sabado");
             break;
     }
    
}
}
