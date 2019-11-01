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

    /**
     * 厨余垃圾分数是否合格
     */
    String kitchenWasteQualified;
    /**
     * 有害垃圾分数是否合格
     */
    String harmfulWasteQualified;
    /**
     * 可回收垃圾分数是否合格
     */
    String recyclableWasteQualified;
    /**
     * 其他垃圾分数是否合格
     */
    String otherWasteQualified;
    /**
     * 总成绩分数是否合格
     */
    String totalQualified;
    public String getKitchenWasteQualified() {
        return kitchenWasteQualified;
    }

    public void setKitchenWasteQualified(String kitchenWasteQualified) {
        this.kitchenWasteQualified = kitchenWasteQualified;
    }

    public String getHarmfulWasteQualified() {
        return harmfulWasteQualified;
    }

    public void setHarmfulWasteQualified(String harmfulWasteQualified) {
        this.harmfulWasteQualified = harmfulWasteQualified;
    }

    public String getRecyclableWasteQualified() {
        return recyclableWasteQualified;
    }

    public void setRecyclableWasteQualified(String recyclableWasteQualified) {
        this.recyclableWasteQualified = recyclableWasteQualified;
    }

    public String getOtherWasteQualified() {
        return otherWasteQualified;
    }

    public void setOtherWasteQualified(String otherWasteQualified) {
        this.otherWasteQualified = otherWasteQualified;
    }

    public String getTotalQualified() {
        return totalQualified;
    }

    public void setTotalQualified(String totalQualified) {
        this.totalQualified = totalQualified;
    }



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



}
