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
public class Exerc2 {
    public static void main(String[] args) {

     Scanner aa = new Scanner(System.in);   
        System.out.println("");
     float a = aa.nextFloat();
     if (a >= 1.99 && a <= 5.99){
         System.out.println("Tá entre, boa");
     }
     else {
         System.out.println("nem tá");
     }
    }
}
