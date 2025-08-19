package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.Moldeador;
import edu.unisabana.pizzafactory.model.Horneador;

public abstract class PizzaFactory {
    public abstract Amasador crearAmasador();
    public abstract Moldeador crearMoldeador();
    public abstract Horneador crearHorneador();

}
