package edu.unisabana.pizzafactory;

import edu.unisabana.pizzafactory.factory.PizzaFactory;
import edu.unisabana.pizzafactory.factory.PizzaDelgadaFactory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaDelgadaFactory();

        factory.crearAmasador().amasar();
        factory.crearMoldeador().molderarPizzaMediana();
        factory.crearHorneador().hornear();
    }
}