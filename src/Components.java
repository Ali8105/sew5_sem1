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

    abstract void calc();

}
