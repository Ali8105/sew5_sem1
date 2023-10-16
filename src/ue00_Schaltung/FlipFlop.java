package ue00_Schaltung;

import java.util.List;

public class FlipFlop extends Komponente {

    /**
     * gib die State an
     */
    boolean state = false;

    /**
     * Interface set
     */
    static int set = 0;

    /**
     * Interface reset
     */
    static int reset = 0;

    /**
     * Out Int Q
     */
    static int Q = 0;

    /**
     * Out Int not Q
     */
    static int not_Q = 1;

    /**
     * Konstruktor FLipFlop geerbt von Komponenten
     * @param name Name vom Komponente
     * @param inputs Liste von Inputs
     * @param outputs Liste von Outputs
     */
    FlipFlop(String name, List<Schnittstelle> inputs, List<Schnittstelle> outputs) {
        super(name, inputs, outputs);
    }

    @Override
    void calc() {
        // Wenn Reset
        if (inputs.get(reset).getState()){
            state = false;
            outputs.get(Q).setState(state);
            outputs.get(not_Q).setState(!state);
        }// Wenn Set
        else if (inputs.get(set).getState()){
            state = true;
            outputs.get(Q).setState(state);
            outputs.get(not_Q).setState(!state);
        }
    }
}
