package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaIntegral implements IMoldeador {
    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza pequeña de masa integral.");
        // Llamado al microcontrolador específico...
    }
    
    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza mediana de masa integral.");
        // Llamado al microcontrolador específico...
    }
}
