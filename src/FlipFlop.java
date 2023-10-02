/**
 * @author aligr
 */
public class FlipFlop {

    boolean state = false;

    public void Set(){
        state = true;
    }

    public void Reset(){
        state = false;
    }

    public boolean Q(){
        return state;
    }

    public boolean notQ(){
        return !state;
    }

    public static void main(String[] args) {

    }


}
