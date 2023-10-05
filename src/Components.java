import java.util.ArrayList;
import java.util.List;

/**
 * @author aligr
 */
abstract  class Components {

    /**
     * Liste von Output Pins
     */
    List<Boolean> pinsOut;

    /**
     * Name vom komponent
     */
    String name;

    /**
     * List von Input Pins
     */
    List<Input> pinsIn;

    /**
     * Komponenten Konstruktor
     * @param name Name der Konstruktor
     * @param outputs Anzahl der Output int
     */
    public Components(String name, int outputs){
        this.name = name;
        pinsOut = new ArrayList<>();
        pinsIn = new ArrayList<>();
        for (int i = 0; i < outputs; i++) {
            pinsOut.add(i,false);
        }
    }

    /**
     * calc für die jeweiligen Komponenten Klassen
     */
    abstract void calc();

    /**
     * um zwei Konstruktor zu verbinden
     * @param srcPort
     * @param comp
     * @param destPort
     */
    public void connect(int srcPort, Components comp, int destPort){
        this.pinsIn.add(srcPort,new Input(destPort,comp));
    }

    /**
     * set the state
     */
    public void fetchInput(){
        for (Input input: pinsIn){
            input.setState(input.getSrcComponent().pinsOut.get(input.srcPort));
        }
    }

    /**
     *
     * @param inputPort vom inpout Port
     * @return liefert den status
     */
    public boolean getInputPort(int inputPort){
        return this.pinsIn.get(inputPort).state;
    }


    /**
     *
     * @param outputPin Welcher Output Int soll angeschaut werden
     * @return ob der Output Pin on/off ist
     */
    public boolean getOutputPin(int outputPin){
        return this.pinsOut.get(outputPin);
    }

    /**
     * Überschreiben der toString Methode
     * @return
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Input input : this.pinsIn) {
            sb.append(input.state);
            sb.append(" ");
        }
        sb.append(": ");
        for (boolean b : this.pinsOut) {
            sb.append(b);
            sb.append(" ");
        }
        return this.name + "( " + sb + ")";

    }
}
