/**
 * @author aligr
 */
public class FlipFlop extends Components {

    public FlipFlop(String name){
        super(name,2);
    }

    public void set(int outputPin){
        this.pinsOut.set(outputPin,(!this.get(outputPin)));
    }

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




