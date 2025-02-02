package edu.unisabana.pizzafactory.model;

public class FabricaPizzaIntegral implements IFabricaPizza {

    @Override
    public IAmasador crearAmasador() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public IHorneador crearHorneador() {
        return new HorneadorPizzaIntegral();
    }

    @Override
    public IMoldeador crearMoldeador() {
        return new MoldeadorPizzaIntegral();
    }
}
