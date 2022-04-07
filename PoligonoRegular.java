/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad6;

/**
 *
 * @author Alo
 */
public class PoligonoRegular  {
    //Atributos privados pero heredables
   protected int numLados;
   protected double longitudLado; //para que sirva en todas las operaciones
   protected int color;
   
   
  public double perimetro(){
       
      return this.numLados*longitudLado;
        
   }
  //este es con double
  public void agrandar(double valor){
       if (valor>0){
           longitudLado+=valor;
           this.longitudLado=valor;
           
       }  
   }
   public PoligonoRegular (){
       //this(LONGI_DEF);//Llamar al constructor de abajo
      this.longitudLado=longitudLado;
      
  }
  public PoligonoRegular (double longitudLado){
      System.out.println("Ejecutar constr Poligono Regular");
      this.longitudLado=longitudLado;
      
  }
  
  
  //sobrescribir print
  public void print(){
        System.out.println("soy un cuadrado");
        System.out.println("Pero nose cuantos lados tengo");
    }
}
