import java.sql.SQLOutput;

public class Test_UML {

    public static void main(String[] args) {
        Taster taster1 = new Taster("taster1");
        Taster taster2 = new Taster("taster2");
        FlipFlop FF = new FlipFlop("FF");
        LED led = new LED("LED1");
        LED led2 = new LED("LED2");

        FF.connect(0, taster1, 0);
        FF.connect(1,taster2,0);
        led.connect(0,FF,0);
        led2.connect(0,FF,1);

        FF.set(1);
        System.out.println(led2.get(0));
        System.out.println(led.get(0));


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

class LED extends Components{
    LED(String name){
        super(name, 1);
        /**
         * Brauchen wir nicht nur damit keine Fehler auftretten
         */
    }

    @Override
    void calc() {

    }
}