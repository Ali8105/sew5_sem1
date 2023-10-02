/**
 * @author aligr
 */
public class FlipFlop {

    /**
     * Variable vom State/Status
     */
    boolean state = false;

    /**
     * Set Interface
     */
    public void Set(){
        state = true;
    }

    /**
     * Reset Interface
     */
    public void Reset(){
        state = false;
    }

    /**
     * Q Interface
     * @return liefert den Status vom Q Interface
     */
    public boolean Q(){
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

    /**
     * Testen der FlipFlop Klasse
     * @param args
     */
    public static void main(String[] args) {
        FlipFlop f = new FlipFlop();
        f.Set();
        System.out.println(f);
        f.Reset();
        System.out.println(f);
    }


}
