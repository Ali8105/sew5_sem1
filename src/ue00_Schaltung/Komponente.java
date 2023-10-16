package ue00_Schaltung;

import java.util.List;

abstract  class Komponente {

    List<Schnittstelle> inputs;
    List<Schnittstelle> outputs;

    abstract void calc();
}
