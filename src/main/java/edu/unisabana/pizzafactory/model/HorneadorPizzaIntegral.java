package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaIntegral implements IHorneador {
    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza integral con masa de trigo integral.");
        // Llamado al microcontrolador específico...
    }
}
