package ue00_Schaltung;

/**
 * @author aligr
 * Klasse Schnitstelle
 */
public class Schnittstelle {

    /**
     * state Variable
     */
    boolean state = false;

    /**
     * Getter fur State
     * @return state
     */
    public boolean getState(){
        return state;
    }

    /**
     * Setter fur State
     * @param state state Value Boolean
     */
    public void setState(boolean state){
        this.state = state;
    }

}
