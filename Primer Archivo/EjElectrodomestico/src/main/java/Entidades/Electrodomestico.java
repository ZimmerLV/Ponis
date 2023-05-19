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
public abstract class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumoE;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoE, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
    }
    Scanner leer = new Scanner(System.in);

    public void crearElectrodomestico() {
        System.out.println("Ingrese el color del electrodomestico");
        color = leer.next();
        System.out.println("Ingrese el consumo electrico que esta en la caja en mayuscula o te van a despedir");
        consumoE = leer.next().charAt(0);
        System.out.println("Ingrese el peso del electrodomestico en KG");
        peso = leer.nextInt();
        precio = 1000d;
        comprobarConsumoElectrico(consumoE);
        comprobarColor(color);
precioFinal(consumoE,peso);
    }

    public void comprobarConsumoElectrico(char z) {
           String x= String.valueOf(z),c = x.toUpperCase();
        
        System.out.println("Consumo electrico = " +x);
        switch (c) {
            case "A":

                consumoE = 'A';

                break;
            case "B":
                consumoE = 'B';
                break;
            case "C":
                consumoE = 'C';
                break;
            case "D":
                consumoE = 'D';
                break;
            case "E":
                consumoE = 'E';
                break;
            case "F":
                consumoE = 'F';
                break;

            default:
                consumoE = 'F';
        }
       
    }

    public void comprobarColor(String colorx) {
        String z = colorx.toUpperCase();
       
        System.out.println("ComprobarColor =" + z);
        switch (z) {
            case "BLANCO":
                color = "BLANCO";
                break;
            case "NEGRO":
                color = "NEGRO";
                break;
            case "ROJO":
                color = "ROJO";
                break;
            case "AZUL":
                color = "AZUL";
                break;
            case "GRIS":
                color = "GRIS";
                break;
            default:
                color = "BLANCO";
        }

    }

    public void precioFinal(char x, int pesox) {

        switch (x) {
            case 'A':

                precio = 1000 + precio;

                break;
            case 'B':
                precio = 800 + precio;
                break;
            case 'C':
                precio = 600 + precio;
                break;
            case 'D':
                precio = 500 + precio;
                break;
            case 'E':
                precio = 300 + precio;
                break;
            case 'F':
                precio = 100 + precio;
                break;
        }
        if (pesox < 20) {
            precio = 100 + precio;
        } else if (pesox > 19 && pesox < 50) {
precio = 500 + precio;
        } else if (pesox > 49 && pesox < 80) {
precio = 800 + precio;
        } else if (pesox > 79) {
precio = 1000 + precio;
        }

    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoE=" + consumoE + ", peso=" + peso + '}';
    }

}
