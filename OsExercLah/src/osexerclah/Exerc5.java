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
public class Exerc5 {
    public static void main(String[] args) {

     Scanner aa = new Scanner(System.in);   
     System.out.println("Digite um numero");
     float a = aa.nextFloat();
     System.out.println("Digite outro numero");
     float b = aa.nextFloat();
     System.out.println("Digite mais um numero");
     float c = aa.nextFloat();
     
     if (a > b && a > c){
         System.out.println(a + " é o maior");
     }
     else if (b > a && b > c){
         System.out.println(b + " é o maior");
     }
     else if (c > b && c > a){
         System.out.println(c + " é o maior");
     }
    if (a < b && a < c){
         System.out.println(a + " é o menor");
     }
    else if (b < a && b < c){
         System.out.println(b + " é o menor");
     }
    else if (c < b && c < a){
         System.out.println(c + " é o menor");
     }
}
}