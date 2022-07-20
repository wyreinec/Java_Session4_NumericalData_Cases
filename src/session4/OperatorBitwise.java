/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session4;

/**
 *
 * @author Administrator
 */
public class OperatorBitwise {
    public static void main(String[] args) {
    
        int x = 4; // --> 0000 0100;
        System.out.println(x<<2); // --> 0010 0000 --> process sama dengan multiplication
        
        x = 4; // -> 0000 0100;
        System.out.println(x>>2); // --> 0000 0001
        
        long x2 = 10;
        long y = 2 * x2;
    }
}
