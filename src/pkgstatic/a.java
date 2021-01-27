/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;

import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class a {
    //hi
    static void hai(){
        System.out.println("Menghitung Luas Permukaan Bola\n");
    }
    static void input(){
        //Scanner
        Scanner input = new Scanner(System.in);
        //Input
        System.out.print("Masukkan jari-jari bola   : ");
        double r = input.nextDouble();
        //Hitung Luas Permukaan bola
        double lp = Math.PI * r * r * 4;
        //output
        System.out.println("Luas Permukaan Bola : "+lp);
    }
}
