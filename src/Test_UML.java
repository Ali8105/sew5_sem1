public class Test_UML {

    public static void main(String[] args) {
        Taster taster1 = new Taster("taster1");
        Taster taster2 = new Taster("taster2");
        FlipFlop FF = new FlipFlop("FF");
        LED led = new LED();

        FF.connect(0, taster1, 0);
        

    }
}


class Taster extends Components{
    Taster(String name){
        super(name, 1);
        /**
         * Brauchen wir nicht nur damit keine Fehler auftretten
         */
    }

    @Override
    void calc() {

    }
}

class LED{
    LED(){
        /**
         * Brauchen wir nicht nur damit keine Fehler auftretten
         */
    }
}