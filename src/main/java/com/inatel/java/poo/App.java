package com.inatel.java.poo;

import com.inatel.java.poo.Brownie.Brownie;
import com.inatel.java.poo.Brownie.BrownieCafe;
import com.inatel.java.poo.Brownie.BrownieDoceDeLeite;
import com.inatel.java.poo.Brownie.BrownieNutella;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        
        // INSTANCIANDO OS OBJETOS
        Brownie brownie = new Brownie("Brownie de Chocolate", 4.00, "Chocolate");
        BrownieNutella brownieNutella = new BrownieNutella("Brownie Nutella", 6.00, "Nutella");
        BrownieCafe brownieCafe = new BrownieCafe("Brownie de Cafe", 5.00, "Cafe");
        BrownieDoceDeLeite brownieDoceDeLeite = new BrownieDoceDeLeite("Brownie Doce de Leite", 5.00, "Doce de Leite");

        // MOSTRANDO INFORMAÇÕES
        brownie.mostraInfo();
        brownieNutella.mostraInfo();
        brownieCafe.mostraInfo();
        brownieDoceDeLeite.mostraInfo();

        // ADICIONANDO AO CARRINHO DE COMPRAS
        brownie.addCarrinhoDeCompras();
        brownieNutella.addCarrinhoDeCompras();
        brownieCafe.addCarrinhoDeCompras();
        brownieDoceDeLeite.addCarrinhoDeCompras();

        // CALCULANDO O VALOR DA COMPRA
        brownie.calculaValorTotalCompra();
        brownieNutella.calculaValorTotalCompra();
        brownieCafe.calculaValorTotalCompra();
        brownieDoceDeLeite.calculaValorTotalCompra();


    }
}
