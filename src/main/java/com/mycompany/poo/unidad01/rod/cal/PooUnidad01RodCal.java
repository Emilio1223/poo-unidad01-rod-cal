/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo.unidad01.rod.cal;

/**
 *
 * @author emilio
 */
public class PooUnidad01RodCal {

    public static void main(String[] args) {
        System.out.println("clase 01-01-02");
        
        var perro1 = new Perro();
        var perro2 = new Perro();
        var perro3 = new Perro();
        perro1.nombre="firulais";
        perro1.raza="mestizo";
        perro1.edad=5;
        
        
        var persona1=new Persona();
        var persona2=new Persona();
        var persona3=new Persona();
        persona1.cedula=035;
        persona1.edad=20;
        persona1.nombre="bella";
        persona2.cedula=076;
        persona2.edad=45;
        persona2.nombre="bella";
        
        
        var auto1=new Auto();
        var auto2=new Auto();
        var auto3=new Auto();
        auto1.ano=2012;
        auto1.marca="toyota";
        auto1.placa="uba5678";
        
        
        
        var computadora1=new Computadora();
        var computadora2=new Computadora();
        var computadora3=new Computadora();
        computadora1.capacidad=667;
        computadora1.marca="dell";
        computadora1.modelo=56;
        
        
        System.out.println("Mi perro se llama: "+perro1.nombre+" tiene " 
                +perro1.edad+ " anos "+" y es un "+perro1.raza);
        System.out.println("Mi perro se llama: "+persona2.nombre+" tiene " 
                +persona2.edad+ " anos "+" y el numero de cedula es "+persona2.cedula);
        
        
    }
}
