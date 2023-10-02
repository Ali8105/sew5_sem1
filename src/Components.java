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


    abstract void calc();

}
