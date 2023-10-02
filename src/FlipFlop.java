/**
 * @author aligr
 */
public class FlipFlop extends Components {

    /**
     * Variable vom State/Status
     */
    boolean state = false;

    /**
     * Set Interface
     */
    public void set(){
        state = true;
    }

    /**
     * Reset Interface
     */
    public void reset(){
        state = false;
    }

    /**
     * Q Interface
     * @return liefert den Status vom Q Interface
     */
    public boolean q(){
        return state;
    }

    /**
     * !Q Interface
     * @return liefert den nicht Status
     */
    public boolean notQ(){
        return !state;
    }

    /**
     * Damit statt Object die state geliefert wird
     * @return state
     */
    public String toString(){
        return Boolean.toString(state);
    }

    @Override
    void calc() {

    }

    @Override
    void push() {
        // don't in use
    }

    /**
     * Testen der FlipFlop Klasse
     * @param args Commandlineparameter
     */
    public static void main(String[] args) {
        FlipFlop f = new FlipFlop();
        f.set();
        System.out.println(f);
        f.reset();
        System.out.println(f);
    }
}




