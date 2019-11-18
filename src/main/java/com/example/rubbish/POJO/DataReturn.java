package com.example.rubbish.POJO;

import java.util.List;

/**
 * 请求返回数据的封装类，主要封装查询的记录集合，以及记录总条数
 * @author zyz
 */
public class DataReturn {
    /**
     * 查询到的记录总条数
     */
    private int dataCount;
    /**
     * 查询到的用户信息
     */
    private List<User> userList;
    /**
     * 查询到的成绩信息
     */
    private List<Grade> gradeList;

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    public int getDataCount() {
        return dataCount;
    }

    public void setDataCount(int dataCount) {
        this.dataCount = dataCount;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
