package ue00_Schaltung;

import java.util.List;

public class FlipFlop extends Komponente {

    /**
     * gib die State an
     */
    boolean state = false;

    static int set = 0;

    static int reset = 0;

    static int Q = 0;

    static int not_Q = 1;

    FlipFlop(String name, List<Schnittstelle> inputs, List<Schnittstelle> outputs) {
        super(name, inputs, outputs);
    }

    @Override
    void calc() {
        if (inputs.get(reset) != null && inputs.get(reset).getState()){
            state = false;
        }
    }
}
