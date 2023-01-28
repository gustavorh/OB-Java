package com.openbootcamp.java;

public class Tema3 {
    public static void main(String[] args) {
        String[] nombres = {"Gustavo", "Ignacio", "Alfonso", "Alberto", "Jose"};

        String resultado = "";
        for (int i = 0; i < nombres.length; i++) {
            resultado += nombres[i] + " ";
        }
        System.out.println(resultado);
    }
}
