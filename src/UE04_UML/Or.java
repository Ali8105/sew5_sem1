/**
 * @author Ali Gurbuz 4CN 23
 */
public class Or extends Gatter{


    /**
     * Super Konstruktor from Gatter
     */
    public Or() {
        super("OR", 2, 1);
    }


    /**
     * Calculate current State
     */
    @Override
    public void calcState() {
        outputs[0].state = inputs[0] || inputs[1];
    }
}
