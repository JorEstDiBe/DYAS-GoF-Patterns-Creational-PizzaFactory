package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaDelgada implements IMoldeador {
    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza pequeña de masa convencional.");
        // Llamado al microcontrolador específico...
    }
    
    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza mediana de masa convencional.");
        // Llamado al microcontrolador específico...
    }
}
