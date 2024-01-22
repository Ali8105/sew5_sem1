import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Ali Gurbuz 4CN 23
 */
public class UMLTest {

    @org.junit.Test
    public void Schaltung_1(){
        //test FlipFlop with two outputs
        //Set up
        Schaltung s1 = new Schaltung();
        Taster t1 = new Taster();
        Taster t2 = new Taster();
        FlipFlop f1 = new FlipFlop();
        LED l1 = new LED();
        t1.connect(0, f1, 0);
        t2.connect(0, f1, 1);
        f1.connect(0, l1, 0);
        s1.save(t1, t2, f1, l1);
        //before pressing any switch
        s1.tick(4);
        assertFalse(f1.outputs[0].state);
        assertFalse(l1.outputs[0].state);
        //turn on lamp
        t1.press();
        s1.tick(4);
        assertTrue(f1.outputs[0].state);
        assertFalse(f1.outputs[1].state);
        assertTrue(l1.outputs[0].state);
        //turn of the lamp
        t1.release();
        t2.press();
        s1.tick(4);
        assertFalse(f1.outputs[0].state);
        assertFalse(l1.outputs[0].state);


    }

    @Test
    public  void Schaltung_2() {
        //test Or
        Schaltung s2 = new Schaltung();
        Taster s2_t1 = new Taster();
        Taster s2_t2 = new Taster();
        Or s2_o = new Or();
        s2_t1.connect(0, s2_o, 0);
        s2_t2.connect(0, s2_o, 1);
        s2.save(s2_t1, s2_t2, s2_o);
        s2.tick(4);
        assertFalse(s2_o.outputs[0].state);
        s2_t1.press();
        s2.tick(4);
        assertTrue(s2_o.outputs[0].state);
        //other input
        s2_t1.release();
        s2_t2.press();
        s2.tick(4);
        assertTrue(s2_o.outputs[0].state);
        //both inputs
        s2_t1.press();
        s2.tick(4);
        assertTrue(s2_o.outputs[0].state);

    }
    @Test
    public void Schaltung_3() {
        //test and
        //Set up
        Schaltung s3 = new Schaltung();
        Taster s3_t1 = new Taster();
        Taster s3_t2 = new Taster();
        And s3_a = new And();
        s3_t1.connect(0, s3_a, 0);
        s3_t2.connect(0, s3_a, 1);
        s3.save(s3_t1, s3_t2, s3_a);
        s3.tick(4);
        assertFalse(s3_a.outputs[0].state);
        s3_t1.press();
        s3.tick(4);
        assertFalse(s3_a.outputs[0].state);
        //other input
        s3_t1.release();
        s3_t2.press();
        s3.tick(4);
        assertFalse(s3_a.outputs[0].state);
        //both inputs
        s3_t1.press();
        s3.tick(4);
        assertTrue(s3_a.outputs[0].state);
    }
}


