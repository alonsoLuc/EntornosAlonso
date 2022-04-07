/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad6;

/**
 *
 * @author Alo
 */
public class Triangulo extends PoligonoRegular {
    //Atributo propio
    protected double altura;
    
    //constructor para que nº de lados sea 3
    	public Triangulo() {
		double c1 = longitudLado/2;
		double h = longitudLado;
		this.altura = 
				Math.sqrt(Math.pow(h,2)-Math.pow(c1,2));
		this.numLados = 3;
	}
    public void agrandar(int valor, char medida){
        longitudLado +=valor;
    }
    public void print(){
        System.out.println("Hola soy un triangulo");
        System.out.println("de altura"+altura);
    }
    public double superficie() {
		return (longitudLado*altura)/2;
	}
}
