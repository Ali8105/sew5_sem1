public class LED extends Components{

    /**
     * Da eine LED immer nur einen Anschluss hat ... auf 1 setzen
     * @param name Name des Components
     */
    public LED(String name) {
        super(name, 1);
    }

    /**
     * Berechnet den Status
     */
    @Override
    void calc() {
        this.pinsOut.set(0,(this.getInputPort(0)));
    }
}
