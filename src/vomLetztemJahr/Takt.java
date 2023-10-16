package vomLetztemJahr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class Takt
 * @author aligr
 */
public class Takt   {

    /**
     * Liste der Kompunenten
     */
    List<Components> comp;

    /**
     * Konstruktor für die ERstellung der Componenten Liste
     * @param components Componenten
     */
    Takt(Components ... components){
        this.comp = new ArrayList<>();
        comp.addAll(Arrays.asList(components));
    }

    /**
     * trigger Methode
     * 1.Phase Werte fetchen
     * 2.Phase Werte berechnen
     */
    public void trigger(){
        for (Components components: comp){
            System.out.println("1.Phase");
            components.fetchInput();;
            System.out.println(components);
            System.out.println("2.Phase");
            components.calc();
            System.out.println(components);
        }
    }
}
