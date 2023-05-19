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
public class Television extends Electrodomestico {
    public int pulgadas;
    public Boolean tdt;

    public Television() {
    }
 public Television(int pulgadas, Boolean tdt, Double precio, String color, char consumoE, int peso) {
        super(precio, color, consumoE, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }
Scanner leer = new Scanner(System.in);
 
    @Override
    public void crearElectrodomestico() {
        System.out.println("Ingrese las pulgadas de su Televisor");
        pulgadas= leer.nextInt();
        System.out.println("Ingrese si tiene sintonizador TDT con TRUE o FALSE sino lo despedimos por manco");
        tdt = leer.nextBoolean();
        
        super.crearElectrodomestico(); 
        
        
        if (tdt) {
            precio = 500 + precio;
        }
        if (pulgadas> 40) {
            precio = (precio*0.30) + precio;
        }
        System.out.println("El precio total del televisor es: "+ precio);
    }
    
    
 
 
}
