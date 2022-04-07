/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.unidad6;

/**
 *
 * @author Alo
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado cua1=new Cuadrado();
        //Llamo a print, que es propio (sobreescrito)
        cua1.print();
        //Llamo al que tengo heredado
         cua1.agrandar(20);
         //Llamo al que he sobrecargado(implementando en cuadrado)
         cua1.agrandar(20.0);
         //Llamo a perimetro, que es heredado
        System.out.println("perimetro:  "+cua1.perimetro());
        //Llamo a superficie, que es propio
        cua1.superficie();
        System.out.println("superficie:  "+cua1.superficie());
        
        Hexagono h= new Hexagono();
	Constructor ejercicio10
    }
    
}
