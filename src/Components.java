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
    
    abstract void calc();

}
