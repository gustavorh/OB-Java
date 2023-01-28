package com.openbootcamp.java;

public class Tema2 {
    public static void main(String[] args) {
        System.out.println(precioIva(5000));
    }

    public static double precioIva(int precio) {
        return precio + (precio * 0.19);
    }
}
