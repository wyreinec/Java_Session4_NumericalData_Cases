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
public class day4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tipe data numeric - bulat
        byte bil1, bil2;
        short b = 200;
        int c = 10000000;
        long d = 100000000L;
        
        //bilangan pecahan
        double x = 20;
        float y = 21;
        
        bil1 = 5;
        bil2 = 4;
        int hasil = bil1 + bil2; //ga boleh pake byte lagi, harus naik tingkatannya dari byte
        
        double hasil2 = x + c;
        
        int q = 5;
        int r =  q = 3;
        System.out.println("nilai q " + q);
        System.out.println("nilai r " + r);
        
        System.out.println(" ");
        System.out.println("====Operasi Aritmetika: Penambahan====");
        int x1, y1;
        x1 = 5;
        y1 = 7;
        System.out.println("Hasil = " + x1 + y1); //otomatis dikonversi jadi string semuanya
        System.out.println("Hasil = " + (x1 + y1));
        
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); //akan mengerjakan yang int dulu
        System.out.println(four + 1 + 2 + three); //semuanya akan dibuah menjadi string
        
        System.out.println(" ");
        System.out.println("====Operasi Aritmetika: Pengurangan====");
        System.out.println(x1 - y1);
        
        System.out.println(" ");
        System.out.println("====Operasi Aritmetika: Perkalian====");
        System.out.println(x1 * y1);
        
        System.out.println(" ");
        System.out.println("====Operasi Aritmetika: Pembagian====");
        System.out.println(x1 / y1);
        
        double hasil3 = 12.0 / 5;
        System.out.println(hasil3);
        
        System.out.println(" ");
        System.out.println("====Operasi Aritmetika: Sisa Pembagian / Modulus====");
        System.out.println(x1 % y1);
        
        System.out.println(" ");
        System.out.println("====Operator Precedence====");
        System.out.println("====Bukan Precedence====");
        int x3 = (((((25 - 5) * 4) / 2) - 10) + 4);
        System.out.println(x3);
        System.out.println(" ");
        System.out.println("====Precedence====");
        int x4 = 25 - 5 * 4 / 2 - 10 + 4;
        System.out.println(x4);
        
        byte bil = 127;
        
        System.out.println("Max Range : " + Byte.MAX_VALUE);
        System.out.println("Min Range : " + Byte.MIN_VALUE);
        System.out.println("Byte : " + Byte.BYTES);
        System.out.println("Bit : " + Byte.SIZE);
       
        byte hasil4 = (byte)(bil + 129);
        System.out.println(hasil4);
        
        short hasil5 = (short)1234556445;
        System.out.println(hasil5);
        
        int hasil6 = (int)21.5;
        System.out.println(hasil6);
        
    }
    
}
