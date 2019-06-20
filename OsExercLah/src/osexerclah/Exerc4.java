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
public class Exerc4 {
    public static void main(String[] args) {

     Scanner aa = new Scanner(System.in);   
     System.out.println("Digite a nota do 1 Bim");
     float a = aa.nextFloat();
     System.out.println("Digite a nota do 2 Bim");
     float b = aa.nextFloat();
     System.out.println("Digite a nota do 3 Bim");
     float c = aa.nextFloat();
     System.out.println("Digite a nota do 4 Bim");
     float d = aa.nextFloat();
     float MA;
     MA = (a+b+c+d)/4;
     if (MA >= 6){
         System.out.println(MA + " Aproved");
     }
     if (MA < 3){
         System.out.println(MA + " Retided");
     }
     if (MA >= 3 && MA < 6){
         System.out.println(MA + " Exam");
     }
    }
}
