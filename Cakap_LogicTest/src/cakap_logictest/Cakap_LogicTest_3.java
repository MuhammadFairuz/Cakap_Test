/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakap_logictest;

/**
 *
 * @author fairu
 */
public class Cakap_LogicTest_3 {
    public static void main(String[] args) {
       int i, j;
    
       for(i=10; i >= 0; i--){
           for(j=10; j>i; j--){
               System.out.print(j+" ");
           }
           System.out.println();
       }    
    }
}
