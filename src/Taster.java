/**
 * @author aligr
 * Klasse Taster
 */
class Taster extends Components{

    Taster(String name){
        super(name, 1);
    }

    /**
     * Wenn der Taster gedrückt wird, wird der Output auf true gesetzt
     */
    public void press(){
        this.pinsOut.set(0,true);
    }

    /**
     * Wenn der Taster "losgelassen" wird, wird der Output wieder auf false gesetzt
     */
    public void release(){
        this.pinsOut.set(0,false);
    }

    /**
     * leer calculate Methode wird nicht verwendet --> uberschreiben da geerbt
     */
    @Override
    void calc() {

    }
}
