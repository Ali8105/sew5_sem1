package ue00_Schaltung;

import java.util.Arrays;
import java.util.List;

public class FlipFlop extends Komponente {

    /**
     * gib die State an
     */
    static boolean state = false;

    /**
     * Interface set
     */
    static int set = 0;

    /**
     * Interface reset
     */
    static int reset = 1;

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

    /**
     * calc von Komponente geerbt
     * berechnet die State
     * @Override
     */
    @Override
    void calc() {
        // Wenn Reset
        if (inputs.get(reset) != null && inputs.get(reset).getState()){
            state = false;
            outputs.get(Q).setState(state);
            outputs.get(not_Q).setState(!state);
        }// Wenn Set
        else if (inputs.get(set) != null && inputs.get(set).getState()){
            state = true;
            outputs.get(Q).setState(state);
            outputs.get(not_Q).setState(!state);
        }

    }

    /**
     * Main Methode
     */
    public static void main(String[] args) {
        Schnittstelle s = new Schnittstelle();
        Schnittstelle rs = new Schnittstelle();
        Schnittstelle q = new Schnittstelle();
        Schnittstelle nq = new Schnittstelle();


        FlipFlop f = new FlipFlop("FF1", Arrays.asList(s, rs), Arrays.asList(q, nq));

        s.setState(true);
        f.calc();
        System.out.println(q.getState());
        System.out.println(nq.getState());

        rs.setState(true);
        f.calc();
        System.out.println(q.getState());
        System.out.println(nq.getState());

        rs.setState(false);
        f.calc();
        System.out.println(q.getState());
        System.out.println(nq.getState());
    }
}
