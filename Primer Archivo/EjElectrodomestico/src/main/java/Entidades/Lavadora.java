/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Pais Gamer
 */
public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(Double precio, String color, char consumoE, int peso) {
        super(precio, color, consumoE, peso);
    }
         Scanner leer = new Scanner(System.in);
    @Override
    public void crearElectrodomestico() {
        System.out.println("Ingrese la carga que tendra la Lavadora");
        carga = leer.nextInt();
       super.crearElectrodomestico();
       
        if (carga>30) {
            precio = 500 + precio;
        }
        System.out.println("El precio total de la lavadora es: " +precio);
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
   
    
    
    
    
}
