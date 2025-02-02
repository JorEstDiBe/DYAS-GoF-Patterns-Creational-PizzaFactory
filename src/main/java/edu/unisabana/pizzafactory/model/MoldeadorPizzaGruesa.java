package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaGruesa implements IMoldeador {
    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza pequeña de masa de pan.");
        // Llamado al microcontrolador específico...
    }
    
    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza mediana de masa de pan.");
        // Llamado al microcontrolador específico...
    }
}
