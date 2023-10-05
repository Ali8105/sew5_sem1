
public class Test_UML {

    public static void main(String[] args) {
        Taster taster1 = new Taster("taster1");
        Taster taster2 = new Taster("taster2");
        FlipFlop FF = new FlipFlop("FF");
        LED led = new LED("LED1");
        FF.connect(0, taster1, 0);
        FF.connect(1,taster2,0);
        led.connect(0,FF,0);

        Takt takt = new Takt(taster1,taster2,FF,led);
        takt.trigger();
        System.out.println(led.getOutputPin(0) + " my first test");

        taster1.press();
        takt.trigger();
        System.out.println(led.getOutputPin(0) + " my second test");



    }
}


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
