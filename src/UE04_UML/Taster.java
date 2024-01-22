/**
 * @author Ali Gurbuz 4CN 23
 */
public class Taster extends Gatter{

    /**
     * Default constructor
     */
    public Taster() {
        super("unused", 0, 1);
        name = "Taster";
    }

    /**
     * Calculate current State
     */
    @Override
    public void calcState() {

    }

    /**
     * Press
     */
    public void press() {
        outputs[0].state = true;
    }

    /**
     * Release
     */

    public void release() {
        outputs[0].state = false;
    }

}
