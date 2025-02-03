package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaIntegral implements IAmasador {
    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[@@] Amasando la pizza integral con masa de trigo integral.");
        // Llamado al microcontrolador específico...
    }
}
