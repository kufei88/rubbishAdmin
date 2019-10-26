package com.example.rubbish.POJO;

public class Region {
    int id;
    String region;
    String time;
    int kitchenWastePassing;
    int harmfulWastePassing;
    int recyclableWastePassing;
    int otherWastePassing;
    int errorPassing;
    int learnPassing;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getKitchenWastePassing() {
        return kitchenWastePassing;
    }

    public void setKitchenWastePassing(int kitchenWastePassing) {
        this.kitchenWastePassing = kitchenWastePassing;
    }

    public int getHarmfulWastePassing() {
        return harmfulWastePassing;
    }

    public void setHarmfulWastePassing(int harmfulWastePassing) {
        this.harmfulWastePassing = harmfulWastePassing;
    }

    public int getRecyclableWastePassing() {
        return recyclableWastePassing;
    }

    public void setRecyclableWastePassing(int recyclableWastePassing) {
        this.recyclableWastePassing = recyclableWastePassing;
    }

    public int getOtherWastePassing() {
        return otherWastePassing;
    }

    public void setOtherWastePassing(int otherWastePassing) {
        this.otherWastePassing = otherWastePassing;
    }

    public int getErrorPassing() {
        return errorPassing;
    }

    public void setErrorPassing(int errorPassing) {
        this.errorPassing = errorPassing;
    }

    public int getLearnPassing() {
        return learnPassing;
    }

    public void setLearnPassing(int learnPassing) {
        this.learnPassing = learnPassing;
    }



}
