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
public class Cakap_LogicTest_1 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 1;
        
        for(i=10; i>=1; i--){
            for(j=1; j<=i; j++){
                System.out.print(j+"");
            }
            for(k=10-n; k>0;k--){
                System.out.print(k+"");
            }
            System.out.println();
            n+=1;
        }
    }
}
