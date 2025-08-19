package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Moldeador;

public class PizzaDelgadaFactory extends PizzaFactory {
    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaDelgada();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaDelgada();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaDelgada();
    }
}
