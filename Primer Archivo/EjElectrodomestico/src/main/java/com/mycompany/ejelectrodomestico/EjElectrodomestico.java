/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejelectrodomestico;

//import Entidades.Electrodomestico;
import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Television;
import java.util.ArrayList;

/**
 *
 * @author Pais Gamer
 */
public class EjElectrodomestico {

    public static void main(String[] args) {
        System.out.println("Hello World!");
//        Electrodomestico Elc = new Electrodomestico();
//        Elc.crearElectrodomestico();
//        System.out.println(Elc);
        
        Lavadora lav = new Lavadora();
        lav.crearElectrodomestico();
        System.out.println(lav);

Television tel = new Television();
tel.crearElectrodomestico();
        System.out.println(tel);
        
        ArrayList<Electrodomestico> Electrodomesticos = new ArrayList();
        Electrodomesticos.add(lav);
        Electrodomesticos.add(tel);
        
        
        int cont = 1;
        Double precioFinal = 0d;
        for (Electrodomestico Elect1 : Electrodomesticos) {
            System.out.println("El precio del electrodomestico " +cont +": " +Elect1.getPrecio());
            cont++;
            precioFinal = Elect1.getPrecio()+precioFinal;
            
        }
        
        System.out.println("\nEl precio final de los electrodomesticos es: " +precioFinal);
    }
}
