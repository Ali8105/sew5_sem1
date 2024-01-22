/**
 * @author Ali Gurbuz 4CN 23
 */
public class LED extends Gatter{


    /**
     * Super Konstruktor from Gatter
     */
    public LED() {
        super("LED", 1, 1);
    }

    /**
     * Calculate current State
     */
    @Override
    public void calcState() {
        outputs[0].state = inputs[0];
    }
}
