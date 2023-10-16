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
        // Wenn reset gedrückt wurde
        if (inputs.get(reset).getState()){
            state = false;
            outputs.get(Q).setState(state);
            outputs.get(not_Q).setState(!state);
        }else if (inputs.get(set).getState()){
            state = true;
        }
    }
}
