package ue00_Schaltung;

import java.util.List;

abstract  class Komponente {

    String name;
    List<Schnittstelle> inputs;
    List<Schnittstelle> outputs;

    Komponente(String name, List<Schnittstelle> inputs, List<Schnittstelle> outputs){
        this.name = name;
        this.inputs = inputs;
        this.outputs = outputs;
    }

    abstract void calc();

}
