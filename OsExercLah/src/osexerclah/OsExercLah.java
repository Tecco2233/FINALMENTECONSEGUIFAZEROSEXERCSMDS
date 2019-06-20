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
public class OsExercLah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner aa = new Scanner(System.in);
        System.out.println("digita um numero ae");
        int a = aa.nextInt();
        if (a < 15){
            System.out.println("É menor parsa");
        }
        else if (a > 100){
            System.out.println("É maior meu querido");
        }
        else {
            System.out.println("nem");
        }
    }
    
}
