package edu.unisabana.pizzafactory.model;

public class FabricaPizzaDelgada implements IFabricaPizza {

    @Override
    public IAmasador crearAmasador() {
        return new AmasadorPizzaDelgada();
    }

    @Override
    public IHorneador crearHorneador() {
        return new HorneadorPizzaDelgada();
    }

    @Override
    public IMoldeador crearMoldeador() {
        return new MoldeadorPizzaDelgada();
    }
}
