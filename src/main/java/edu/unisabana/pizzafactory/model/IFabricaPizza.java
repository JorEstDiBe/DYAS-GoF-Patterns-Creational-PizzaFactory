package edu.unisabana.pizzafactory.model;

public interface IFabricaPizza {
    IAmasador crearAmasador();
    IHorneador crearHorneador();
    IMoldeador crearMoldeador();
}
