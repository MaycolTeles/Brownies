package com.inatel.java.poo.Brownie;


public class BrownieCafe extends Brownie {

    // DEFININDO OS MÉTODOS
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe() {
        System.out.println("Adicionando Cafe...");
    }

}