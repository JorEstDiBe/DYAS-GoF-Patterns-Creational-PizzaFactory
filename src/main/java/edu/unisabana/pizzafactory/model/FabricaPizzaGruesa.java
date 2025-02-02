package edu.unisabana.pizzafactory.model;

public class FabricaPizzaGruesa implements IFabricaPizza {

    @Override
    public IAmasador crearAmasador() {
        return new AmasadorPizzaGruesa();
    }

    @Override
    public IHorneador crearHorneador() {
        return new HorneadorPizzaGruesa();
    }

    @Override
    public IMoldeador crearMoldeador() {
        return new MoldeadorPizzaGruesa();
    }
}
