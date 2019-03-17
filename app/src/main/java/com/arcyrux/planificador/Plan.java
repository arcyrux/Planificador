//package com.arcyrux.planificador;
//
//import java.util.ArrayList;
//
//public class Plan {
//
//    //Pierna[] pierna = new Pierna[];
//
//    private ArrayList<Pierna> piernas = new ArrayList<Pierna>();
//    private Pierna item = new Pierna();
//
//
//
//    public ArrayList<Pierna> getPierna() {
//        return piernas;
//    }
//
//    public void setPierna(ArrayList<Pierna> piernas) {
//        this.piernas = piernas;
//    }
//
//    public int getLargo() {
//        return piernas.size();
//    }
//    public void addLeg(Pierna pierna){
//        piernas.add(pierna);
//    }
//
//    public void addLeg(){
//        Pierna pierna = new Pierna();
//        pierna.setLegNumber(getLargo());
//        piernas.add(pierna);
//    }
//
//    public void removeLeg(){
//        int largo = getLargo();
//        if (largo > 1){
//        piernas.remove(largo - 1);
//        }
//    }
//
//    public String origen(int orden){
//        item = piernas.get(orden);
//        return item.getOrigen();
//    }
//
//
//    public String destino(int orden){
//        item = piernas.get(orden);
//        return item.getDestino();
//    }
//}
