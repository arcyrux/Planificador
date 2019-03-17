package com.arcyrux.planificador;

import android.os.Parcel;
import android.os.Parcelable;

public class Pierna implements Parcelable{

    private String origen;
    private String destino;
    private int legNumber;
    private float radio;
    private int magneticCourse;
    private int altitud;
    private int windDirection;
    private int windVelocity;
    private int ias;
    private int tas;
    private int trueCourse;
    private int trueHeading;
    private int magneticHeading;
    private int compasHeading;
    private float distance;
    private int groundSpeed;
    private long ete;
    private long eta;
    private float fuel;


    public Pierna(String origen, String destino, int legNumber, float radio, int magneticCourse,
                  int altitud, int windDirection, int windVelocity, int ias, int tas,
                  int trueCourse, int trueHeading, int magneticHeading, int compasHeading,
                  float distance, int groundSpeed, long ete, long eta, float fuel) {
        this.origen = origen;
        this.destino = destino;
        this.legNumber = legNumber;
        this.radio = radio;
        this.magneticCourse = magneticCourse;
        this.altitud = altitud;
        this.windDirection = windDirection;
        this.windVelocity = windVelocity;
        this.ias = ias;
        this.tas = tas;
        this.trueCourse = trueCourse;
        this.trueHeading = trueHeading;
        this.magneticHeading = magneticHeading;
        this.compasHeading = compasHeading;
        this.distance = distance;
        this.groundSpeed = groundSpeed;
        this.ete = ete;
        this.eta = eta;
        this.fuel = fuel;
    }

    public Pierna(int legNumber){

        this.legNumber = legNumber;
        this.origen = "";
        this.destino = "";
        this.legNumber = 0;
        this.radio = 0;
        this.magneticCourse = 0;
        this.altitud = 0;
        this.windDirection = 0;
        this.windVelocity = 0;
        this.ias = 0;
        this.tas = 0;
        this.trueCourse = 0;
        this.trueHeading = 0;
        this.magneticHeading = 0;
        this.compasHeading = 0;
        this.distance = 0;
        this.groundSpeed = 0;
        this.ete = 0;
        this.eta = 0;
        this.fuel = 0;

    }


    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getLegNumber() {
        return legNumber;
    }

    public void setLegNumber(int legNumber) {
        this.legNumber = legNumber;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public int getMagneticCourse() {
        return magneticCourse;
    }

    public void setMagneticCourse(int magneticCourse) {
        this.magneticCourse = magneticCourse;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    public int getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(int windDirection) {
        this.windDirection = windDirection;
    }

    public int getWindVelocity() {
        return windVelocity;
    }

    public void setWindVelocity(int windVelocity) {
        this.windVelocity = windVelocity;
    }

    public int getIas() {
        return ias;
    }

    public void setIas(int ias) {
        this.ias = ias;
    }

    public int getTas() {
        return tas;
    }

    public void setTas(int tas) {
        this.tas = tas;
    }

    public int getTrueCourse() {
        return trueCourse;
    }

    public void setTrueCourse(int trueCourse) {
        this.trueCourse = trueCourse;
    }

    public int getTrueHeading() {
        return trueHeading;
    }

    public void setTrueHeading(int trueHeading) {
        this.trueHeading = trueHeading;
    }

    public int getMagneticHeading() {
        return magneticHeading;
    }

    public void setMagneticHeading(int magneticHeading) {
        this.magneticHeading = magneticHeading;
    }

    public int getCompasHeading() {
        return compasHeading;
    }

    public void setCompasHeading(int compasHeading) {
        this.compasHeading = compasHeading;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getGroundSpeed() {
        return groundSpeed;
    }

    public void setGroundSpeed(int groundSpeed) {
        this.groundSpeed = groundSpeed;
    }

    public long getEte() {
        return ete;
    }

    public void setEte(long ete) {
        this.ete = ete;
    }

    public long getEta() {
        return eta;
    }

    public void setEta(long eta) {
        this.eta = eta;
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

//    public void addLeg(){
//        Pierna pierna = new Pierna();
//        pierna.setLegNumber(getLargo());
//        piernas.add(pierna);
//    }


    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(origen);
        out.writeString(destino);
        out.writeInt(legNumber);
        out.writeFloat(radio);
        out.writeInt(magneticCourse);
        out.writeInt(altitud);
        out.writeInt(windDirection);
        out.writeInt(windVelocity);
        out.writeInt(ias);
        out.writeInt(tas);
        out.writeInt(trueCourse);
        out.writeInt(trueHeading);
        out.writeInt(magneticHeading);
        out.writeInt(compasHeading);
        out.writeFloat(distance);
        out.writeInt(groundSpeed);
        out.writeLong(ete);
        out.writeLong(eta);
        out.writeFloat(fuel);
    }

    public static final Parcelable.Creator<Pierna> CREATOR = new Parcelable.Creator<Pierna>() {
                @Override
                public Pierna createFromParcel(Parcel in) {return new Pierna(in);}
                @Override
                public Pierna[] newArray(int size) {return new Pierna[size];
                }
            };

    private Pierna(Parcel in){
        origen = in.readString();
        destino = in.readString();
        legNumber = in.readInt();
        radio = in.readFloat();
        magneticCourse = in.readInt();
        altitud = in.readInt();
        windDirection= in.readInt();
        windVelocity = in.readInt();
        ias= in.readInt();
        tas= in.readInt();
        trueCourse= in.readInt();
        trueHeading= in.readInt();
        magneticHeading= in.readInt();
        compasHeading= in.readInt();
        distance= in.readFloat();
        groundSpeed= in.readInt();
        ete= in.readLong();
        eta= in.readLong();
        fuel= in.readFloat();
    }


}
