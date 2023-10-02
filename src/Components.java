import java.util.ArrayList;
import java.util.List;

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
     *
     * @param inputPort vom inpout Port
     * @return liefert den status
     */
    public boolean getInputPort(int inputPort){
        return this.pinsIn.get(inputPort).state;
    }

}
