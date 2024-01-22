/**
 * @author Ali Gurbuz 4CN 23
 */
public class FlipFlop extends Gatter{

    /**
     * Default Konstruktor
     */
    public FlipFlop() {
        super("FlipFlop", 2, 2);
    }

    /**
     * Calculate current State
     */
    @Override
    public void calcState() {
        outputs[0].state = (!inputs[1] && (inputs[0] || outputs[0].state));
    }
}
