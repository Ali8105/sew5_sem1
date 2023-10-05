class Taster extends Components{
    Taster(String name){
        super(name, 1);
        /**
         * Brauchen wir nicht nur damit keine Fehler auftretten
         */
    }

    public void press(){
        this.pinsOut.set(0,true);
    }

    public void release(){
        this.pinsOut.set(0,false);
    }

    @Override
    void calc() {

    }
}
