package vomLetztemJahr;

/**
 * @author aligr
 */
public class FlipFlop extends Components {

    /**
     * Konstruktor für das Erstellen von FlipFlops
     * @param name Name vom FlipFlop
     */
    public FlipFlop(String name){
        super(name,2);
    }


    /**
     * Berechnet, welchen State der Output Pin haben soll
     * extends von Components
     */
    @Override
    void calc() {
        if (this.getInputPort(0)){
            this.pinsOut.set(0,true);
            this.pinsOut.set(1,false);
        }else if (this.getInputPort(1)){
            this.pinsOut.set(0,false);
            this.pinsOut.set(1,true);
        }
    }


}




