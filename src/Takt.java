import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Takt   {

    List<Components> comp;
    Takt(Components ... components){
        this.comp = new ArrayList<>();
        comp.addAll(Arrays.asList(components));
    }

    public void trigger(){
        for (Components components: comp){

        }
    }
}
