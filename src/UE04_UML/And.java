/**
 * @author Ali Gurbuz 4CN 23
 * Klasse AND
 * Extends from Gatter
 */
public class And extends Gatter{

    /**
     * Super Konstruktor from Gatter
     */
    public And() {
        super("AND", 2, 2);
    }

    /**
     * Calcstate current State
     */
    @Override
    public void calcState() {
        outputs[0].state = inputs[0] && inputs[1];
    }
}
