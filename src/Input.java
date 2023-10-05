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
     * get Src Component
     * @return this component
     */
    public Components getSrcComponent(){
        return this.component;
    }

    /**
     * Setzt den Status
     * @param state true/false
     */
    public void setState(boolean state){
        this.state = state;
    }

}
