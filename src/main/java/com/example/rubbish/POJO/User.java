package com.example.rubbish.POJO;

/**
 * 用户，成绩
 * @author 田易
 */
public class User {
    /**
     * id
     */
    int id;
    /**
     *用户名
     */
    String userName;
    /**
     * 地区
     */
    String region;
    /**
     * 年龄
     */
    int age;
    /**
     * 厨余垃圾分数
     */
    int kitchenWasteFraction;
    /**
     * 有害垃圾分数
     */
    int harmfulWasteFraction;
    /**
     * 可回收垃圾分数
     */
    int recyclableWasteFraction;
    /**
     * 其他垃圾分数
     */
    int otherWasteFraction;
    /**
     * 总评分
     */
    int scoreFraction;
    /**
     * 性别
     */
    String sex;
    /**
     * 添加时间
     */
    String insertTime;
    /**
     * 更新时间
     */
    String updateTime;
    /**
     * 工作单位
     */
    String workspace;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKitchenWasteFraction() {
        return kitchenWasteFraction;
    }

    public void setKitchenWasteFraction(int kitchenWasteFraction) {
        this.kitchenWasteFraction = kitchenWasteFraction;
    }

    public int getHarmfulWasteFraction() {
        return harmfulWasteFraction;
    }

    public void setHarmfulWasteFraction(int harmfulWasteFraction) {
        this.harmfulWasteFraction = harmfulWasteFraction;
    }

    public int getRecyclableWasteFraction() {
        return recyclableWasteFraction;
    }

    public void setRecyclableWasteFraction(int recyclableWasteFraction) {
        this.recyclableWasteFraction = recyclableWasteFraction;
    }

    public int getOtherWasteFraction() {
        return otherWasteFraction;
    }

    public void setOtherWasteFraction(int otherWasteFraction) {
        this.otherWasteFraction = otherWasteFraction;
    }

    public int getScoreFraction() {
        return scoreFraction;
    }

    public void setScoreFraction(int scoreFraction) {
        this.scoreFraction = scoreFraction;
    }


}
