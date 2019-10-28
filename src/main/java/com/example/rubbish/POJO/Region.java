package com.example.rubbish.POJO;

/**
 * 地区，时间，通过率
 * @author 田易
 */
public class Region {
    /**
     * id
     */
    int id;
    /**
     * 地区
     */
    String region;
    /**
     * 时间
     */
    String time;
    /**
     * 厨余垃圾通过率
     */
    int kitchenWastePassing;
    /**
     * 有害垃圾通过率
     */
    int harmfulWastePassing;
    /**
     * 可回收垃圾通过率
     */
    int recyclableWastePassing;
    /**
     * 其他垃圾通过率
     */
    int otherWastePassing;
    /**
     * 错误率
     */
    int errorPassing;
    /**
     * 学习通过率
     */
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
