package com.arcyrux.planificador;

import java.util.ArrayList;

public class Plan {

    //Pierna[] pierna = new Pierna[];

    ArrayList<Pierna> piernas = new ArrayList<Pierna>();
    int largo;


    public ArrayList<Pierna> getPiernas() {
        return piernas;
    }

    public void setPiernas(ArrayList<Pierna> piernas) {
        this.piernas = piernas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
}
