/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad6;

/**
 *
 * @author Alo
 */
public class PentagonoRegular extends PoligonoRegular {
        //Solo si queremos que tenga valor de apotema
    //como atributo
    //protected double apotema; Si quieres que sea heredable
    //private double apotema; si no quieres que sea heredable
    
    public PentagonoRegular(){
        //No hay llamada implicita a super()
        //porque esta el this
     this(100);   
    }
    public PentagonoRegular(int lado){
        //No mw vale la llamada implicita a super();
        super(lado);
        this.numLados=5;
    }
    public double apotema(){
        double a=0;
        return a;
    }
    
}
