import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ali Gurbuz 4CN 23
 */
public class Schaltung {

    /**
     * GatterList
     */
    List<Gatter> gatterList = new ArrayList<>();

    /**
     * Tick
     * @param num the number of ticks
     */
    public void tick(int num){
        while(--num >= 0) {
            gatterList.forEach(Gatter::calcState); //Phase 1
            gatterList.forEach(Gatter::set);    //Phase 2
        }
    }

    /**
     * Save
     * @param e elements
     */
    public void save(Gatter... e){
        gatterList.addAll(Arrays.asList(e));
    }
}
