

package com.mycompany.examen2;

import java.util.Scanner;
public class Examen2 {

    public static void main(String[] args) {
     Scanner lectura = new Scanner(System.in);
        
        System.out.println("Dime  el nombre del primer instrumento");
        String instrumento= lectura.nextLine();
        System.out.println("Dime el segundo nombre del instrumento");
        String instrumento2= lectura.nextLine();
         System.out.println("Dime el tercer nombre del instrumento");
        String instrumento3=lectura.nextLine();
        
        System.out.println("ingresa el precio de compra de "+instrumento);
        
        double inst=lectura.nextInt();
       
        System.out.println("Ingresa el precio de compra de"+instrumento2);
        
        double inst2=lectura.nextInt();
        
   
        System.out.println("Ingresa el precio de compra de"+instrumento3);
        
        double inst3=lectura.nextInt();
        
        
        double Compra=inst+inst2+inst3;
        
        System.out.println("Escribe el precio de venta de"+instrumento);
        double x1=lectura.nextInt();
        System.out.println("Escribe el precio de venta de" +instrumento2);
        double x2=lectura.nextInt();
        System.out.println("Escribe el precio de venta de"+instrumento3);
        double x3=lectura.nextInt();
        
        double ganancia1=x1-inst;
        double ganancia2=x2-inst2;
        double ganancia3=x3-inst3;
        
        System.out.println("La ganacia del primer instrumento es"+ganancia1);
        System.out.println("La ganacia del segundo instrumento es"+ganancia2);
        System.out.println("La ganancia del tercer instrumento es"+ganancia3);        
    }
}
