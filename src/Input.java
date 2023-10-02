public class Input {

    /**
     * Komponenten
     */
    Components component;

    /**
     * Source Port
     */
    int srcPort;

    /**
     * State
     */
    boolean state;

    /**
     * Input Konstruktor
     * @param srcPort destination Port zu dem man sich vrbindet
     * @param component an welches Gerät man sich verbindet
     */
    Input(int srcPort, Components component){
        this.srcPort = srcPort;
        this.component = component;
    }

    /**
     * Input Konstruktor
     * @param srcPort destination Port an dem man sich verbindet
     * @param component an welches Gerät man sich verbindet
     * @param state was für eine State es hat (true, false)
     */
    Input(int srcPort, Components component, boolean state){
        this.srcPort = srcPort;
        this.component = component;
        this.state = state;
    }
}
