package ue00_Schaltung;

import java.util.List;

abstract  class Komponente {

    /**
     * Name vom Komponente
     */
    String name;
    /**
     * Liste von inputs
     */
    List<Schnittstelle> inputs;
    /**
     * Lsite von outputs
     */
    List<Schnittstelle> outputs;

    /**
     * Konstruktor Komponente
     * @param name Name
     * @param inputs Inputs
     * @param outputs Outputs
     */
    Komponente(String name, List<Schnittstelle> inputs, List<Schnittstelle> outputs){
        this.name = name;
        this.inputs = inputs;
        this.outputs = outputs;
    }

    /**
     * Abstracte Methode calc
     */
    abstract void calc();

}
