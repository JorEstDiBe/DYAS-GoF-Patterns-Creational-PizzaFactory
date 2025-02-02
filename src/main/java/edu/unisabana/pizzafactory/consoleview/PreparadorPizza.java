package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.FabricaPizzaDelgada;
import edu.unisabana.pizzafactory.model.IFabricaPizza;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PreparadorPizza {

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes = new Ingrediente[]{
                new Ingrediente("queso",1),
                new Ingrediente("jamon",2)
            };            
            
            PreparadorPizza pp = new PreparadorPizza();
            // Para la variante de pizza delgada se usa la fábrica correspondiente.
            IFabricaPizza fabrica = new FabricaPizzaDelgada();
            pp.prepararPizza(ingredientes, Tamano.MEDIANO, fabrica);
            
            // En el futuro, para usar otra variante, solo se cambiará la fábrica:
            // IFabricaPizza fabrica = new FabricaPizzaGruesa();
            // o
            // IFabricaPizza fabrica = new FabricaPizzaIntegral();
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName())
                  .log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
    }
    
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam, IFabricaPizza fabrica)
            throws ExcepcionParametrosInvalidos {
        // Se obtienen los objetos adecuados según la variante seleccionada.
        fabrica.crearAmasador().amasar();
        
        // El moldeado depende del tamaño de la pizza.
        if (tam == Tamano.PEQUENO) {
            fabrica.crearMoldeador().moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            fabrica.crearMoldeador().moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamaño de pizza inválido: " + tam);
        }
        
        aplicarIngredientes(ingredientes);
        fabrica.crearHorneador().hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES: {0}", Arrays.toString(ingredientes));
        // Lógica de llamado al microcontrolador para aplicar ingredientes...
    }
}
