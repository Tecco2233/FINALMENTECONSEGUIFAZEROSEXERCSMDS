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
public class Exerc6 {
    public static void main(String[] args) {

     Scanner aa = new Scanner(System.in);   
     System.out.println("Digite um numero");
        int a = aa.nextInt();
     int N;
        N = a % 2 ;
     if (N == 1){
         System.out.println(a + " é impar");
         
     } else {
         System.out.println(a + " é par");
     }
}
}