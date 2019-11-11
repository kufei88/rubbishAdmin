package com.example.rubbish.mapper;

import com.example.rubbish.POJO.Region;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 田易
 */

public interface RubbishMapper {
    /**
     *查询所有信息
     * @return
     */
    @Select("select * from regioninfo")
    public List<Region> getRegionInfo();

    /**
     * 四种垃圾每一种垃圾1-12月份的通过率
     * @return
     */
    @Select("SELECT kitchenWastePassing,harmfulWastePassing,recyclableWastePassing,otherWastePassing,MONTH(time) from regioninfo WHERE time like CONCAT(#{time},'%') order by MONTH(time) asc")
    public List<Region> getWastePassing(@Param("time") String time);

    /**
     * 厨余垃圾1-12月份的通过率
     * @param date
     * @return
     */
    @Select("SELECT AVG(kitchenWastePassing) from regioninfo WHERE time like CONCAT(#{date},'%')")
    public String getkitchenWastePassing(@Param("date") String date);
    /**
     * 有害垃圾1-12月份的通过率
     * @param date
     * @return
     */
    @Select("SELECT AVG(harmfulWastePassing) from regioninfo WHERE time like CONCAT(#{date},'%')")
    public String getHarmfulWastePassing(@Param("date") String date);
    /**
     * 可回收垃圾1-12月份的通过率
     * @param date
     * @return
     */
    @Select("SELECT AVG(recyclableWastePassing) from regioninfo WHERE time like CONCAT(#{date},'%')")
    public String getRecyclableWastePassing(@Param("date") String date);
    /**
     * 其他垃圾1-12月份的通过率
     * @param date
     * @return
     */
    @Select("SELECT AVG(otherWastePassing) from regioninfo WHERE time like CONCAT(#{date},'%')")
    public String getOtherWastePassing(@Param("date") String date);

    /**
     * 得到地区
     * @return
     */
    @Select("SELECT DISTINCT region from regioninfo")
    public List<Region> getRegionAll();


    /**
     *金华各地区1-12月份的学习通过率
     * @param region
     * @return
     */
    @Select("SELECT AVG(learnPassing) from regioninfo WHERE region = #{region} and time like CONCAT(#{date},'%')")
    public String getLearnPassing(@Param("region") String region,@Param("date") String date);

    /**
     * 各地区错误率
     * @param region
     * @param date
     * @return
     */
    @Select("SELECT AVG(errorPassing) from regioninfo WHERE region = #{region} and time like CONCAT(#{date},'%')")
    public Float getErrorPassing(@Param("region") String region,@Param("date") String date);

    /**
     * 各地区覆盖率
     * @param region
     * @param date
     * @return
     */
    @Select("SELECT AVG(coverage) from regioninfo WHERE region = #{region} and time like CONCAT(#{date},'%')")
    public Float getCoverage(@Param("region") String region,@Param("date") String date);

    /**
     * 得到地区
     * @return
     */
    @Select("select DISTINCT region FROM userinfo")
    public List<Region> getRrgion();

    /**
     * 指定地区总人数
     * @return
     */
    @Select("select  count(id) from userinfo where region = #{region} ")
    public int getUserAll(String region);

    /**
     * 指定地区掌握总人数
     * @return
     */
    @Select("select  count(id) from userinfo where totalQualified = '合格' and region = #{region}")
    public int getAll(String region);

    /**
     * 注册总人数
     * @return
     */
    @Select("select count(id) from userinfo")
    public int getUserSum();

    /**
     * 注册的学生总人数
     * @return
     */
    @Select("select count(id) from userinfo where workspace = '学生'")
    public int getStudentSum();

    /**
     * 注册的学前儿童
     * @return
     */
    @Select("select count(id) from userinfo where age <= 6")
    public int getChildrenSum();

    /**
     * 注册的青年
     * @return
     */
    @Select("select count(id) from userinfo where age between 15 and 44")
    public int getYouthSum();

    /**
     * 注册的中年
     * @return
     */
    @Select("select count(id) from userinfo where age between 45 and 59")
    public int getMiddleSum();

    /**
     * 注册的老年
     * @return
     */
    @Select("select count(id) from userinfo where age >=65")
    public int getOldSum();



}
