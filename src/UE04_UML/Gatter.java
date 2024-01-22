/**
 * @author Ali Gurbuz 4CN 23
 */
public abstract class Gatter {

    /**
     * Outputs
     */
    Output[] outputs;

    /**
     * Inputs
     */
    boolean[] inputs;

    /**
     * Name
     */
    String name;

    /**
     * Identifier vom Komponent
     */
    static int countId;

    /**
     * Id fur Komponent
     */
    int id;

    public Gatter(String name, int numberOfInputs, int numberOfOutputs){
       id = countId;
       this.name = name;
       inputs = new boolean[numberOfInputs];
       outputs = new Output[numberOfOutputs];
        for (int i = 0; i < numberOfOutputs; i++) {
            outputs[i] = new Output();
        }
    }

    /**
     * Copy to Input
     */
    public void set() {
        for (Output o : outputs) o.setInput();
    }


    /**
     * Connect
     *
     * @param localPin     pin
     * @param remoteGatter other
     * @param remotePin    other index
     */
    public void connect(int localPin, Gatter remoteGatter, int remotePin) {
        outputs[localPin].connect(remoteGatter, remotePin);
    }

    /**
     * Abstract wird von den Komponenten ueberschrieben
     */
    public abstract void calcState();


    public void setInputState(int pin,boolean state){
        try{
            inputs[pin] = state;
        }catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("Fehler");
        }
    }

}