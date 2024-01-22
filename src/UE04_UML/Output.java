import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ali Gurbuz 4CN 23
 */
public class Output {

    /**
     * Default state vom Output ist falsch
     */
    boolean state = false;

    /**
     * output : index
     */
    Map<Gatter, List<Integer>> outputConnections = new HashMap<>();

    public void setInput(){
        for (Map.Entry<Gatter, List<Integer>> entry : outputConnections.entrySet()){
            Gatter otherGatter = entry.getKey();
            List<Integer> value = entry.getValue();
            for (int zielPort : value) {
               otherGatter.setInputState(zielPort,state);
            }
        }
    }

    /**
     * Connector
     * @param e Other Gatter
     * @param pin pin index
     */
    public void connect(Gatter e, int pin){
        if (outputConnections.containsKey(e)){
            ArrayList<Integer> map = new ArrayList<>(outputConnections.get(e));
            map.add(pin);
            outputConnections.put(e,map);
        }else{
            outputConnections.put(e,List.of(pin));
        }
    }


}
