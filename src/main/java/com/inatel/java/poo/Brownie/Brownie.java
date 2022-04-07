package com.inatel.java.poo.Brownie;

public class Brownie {

    // DECLARANDO OS ATRIBUTOS
    protected String nome;
    protected double preco;
    protected String sabor;


    // DEFININDO OS MÉTODOS
    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando o Brownie " + this.nome + " ao carrinho de compras...");
    }

    public void calculaValorTotalCompra(){
        System.out.println("Valor total da compra do brownie " + this.nome + ": R$" + this.preco);
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Sabor: " + this.sabor);
    }

    
}
