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
    float kitchenWastePassing;
    /**
     * 有害垃圾通过率
     */
    float harmfulWastePassing;
    /**
     * 可回收垃圾通过率
     */
    float recyclableWastePassing;
    /**
     * 其他垃圾通过率
     */
    float otherWastePassing;
    /**
     * 错误率
     */
    float errorPassing;
    /**
     * 学习通过率
     */
    float learnPassing;

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

    public float getKitchenWastePassing() {
        return kitchenWastePassing;
    }

    public void setKitchenWastePassing(float kitchenWastePassing) {
        this.kitchenWastePassing = kitchenWastePassing;
    }

    public float getHarmfulWastePassing() {
        return harmfulWastePassing;
    }

    public void setHarmfulWastePassing(float harmfulWastePassing) {
        this.harmfulWastePassing = harmfulWastePassing;
    }

    public float getRecyclableWastePassing() {
        return recyclableWastePassing;
    }

    public void setRecyclableWastePassing(float recyclableWastePassing) {
        this.recyclableWastePassing = recyclableWastePassing;
    }

    public float getOtherWastePassing() {
        return otherWastePassing;
    }

    public void setOtherWastePassing(float otherWastePassing) {
        this.otherWastePassing = otherWastePassing;
    }

    public float getErrorPassing() {
        return errorPassing;
    }

    public void setErrorPassing(float errorPassing) {
        this.errorPassing = errorPassing;
    }

    public float getLearnPassing() {
        return learnPassing;
    }

    public void setLearnPassing(float learnPassing) {
        this.learnPassing = learnPassing;
    }



}
