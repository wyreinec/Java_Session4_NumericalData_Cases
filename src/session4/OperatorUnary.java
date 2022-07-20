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
public class OperatorUnary {
    public static void main(String[] args) {
        System.out.println("====Operator Unary: Increment====");
        int x;
        x = 5;
        System.out.println("");
        System.out.println("====Operator Unary: Post Increment====");
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x); //hasil penambahan x nya baru muncul di line ini
        
//        int y = x++;
//        System.out.println(x);
//        System.out.println(y);
        
        System.out.println("");
        System.out.println("====Operator Unary: Pre Increment====");
        x = 5;
        System.out.println(x);
        System.out.println(++x); //tambahkan dulu nilainya kemudian cetak
        System.out.println(x++); //cetak dulu baru tambahkan sebenernya cetaknya itu 7
        System.out.println(++x);
        System.out.println(x);
        
        x = 5;
        System.out.println("");
        System.out.println("====Operator Unary: Post Decrement====");
        System.out.println(x);
        System.out.println(x--);
        System.out.println(x); //hasil penambahan x nya baru muncul di line ini
        
        x = 5;
        System.out.println("");
        System.out.println("====Operator Unary: Pre Decrement====");
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x); //hasil penambahan x nya baru muncul di line ini
        
        x = 5;
        System.out.println("");
//        System.out.println(x++ + ++x); = 5 + 7
        System.out.println(x++);
        System.out.println(++x);
        
        System.out.println("");
        for (x = 0; x < 5; x++)
        {
            System.out.println(x);
        }
        
        System.out.println("");
        for (x = 0; x < 5; ++x)
        {
            System.out.println(x);
        }
    }
}
