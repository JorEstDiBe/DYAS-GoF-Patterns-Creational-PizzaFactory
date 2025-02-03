package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaGruesa implements IAmasador {
    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaGruesa.class.getName())
            .log(Level.INFO, "[@@] Amasando la pizza gruesa con masa de pan.");
        // Llamado al microcontrolador específico...
    }
}
