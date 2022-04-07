/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad6;

/**
 *
 * @author Alo
 */
public class Cuadrado extends PoligonoRegular {
    //¿Que atributos tiene esa clase?
    //private int numLados, longitudLado,
    //los heredados: numLados;
    //private int longitudLado
    //public int perimetro()
    //public void agrandar (int)
    public Cuadrado(){
        //super();
        //Si quieres elegir constructor de la clase padre utilizo super explicito
        super(20); //Invoco el constructor con parametros longiLado
        this.numLados=4;
        System.out.println("Creado cuadrado lado");
    }
    //Añado superficie
    public double superficie(){
        return this.longitudLado*this.longitudLado;
    }
    //Sobrecargar agrandar para usar nºreal
    public void agrandar(double valor){
        this.longitudLado=valor;
    }
    
    //Sobrescribir el perímetro
    public void print(){
        System.out.println("soy el perimetro regular");
        System.out.println("Pero nose cuantos lados tengo");
    }
    
    
}
