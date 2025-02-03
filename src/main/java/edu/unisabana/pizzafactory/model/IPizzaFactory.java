// IPizzaFactory.java
package edu.unisabana.pizzafactory.model;

public interface IPizzaFactory {
    IAmasador crearAmasador();
    IMoldeador crearMoldeador();
    IHorneador crearHorneador();
}
