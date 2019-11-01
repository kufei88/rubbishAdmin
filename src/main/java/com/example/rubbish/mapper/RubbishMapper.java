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
    @Select("SELECT kitchenWastePassing from regioninfo WHERE time like CONCAT(#{date},'%') order by MONTH(time) asc")
    public List<Long> getkitchenWastePassing(@Param("date") String date);
    /**
     * 有害垃圾1-12月份的通过率
     * @param date
     * @return
     */
    @Select("SELECT harmfulWastePassing from regioninfo WHERE time like CONCAT(#{date},'%') order by MONTH(time) asc")
    public List<Long> getHarmfulWastePassing(@Param("date") String date);
    /**
     * 可回收垃圾1-12月份的通过率
     * @param date
     * @return
     */
    @Select("SELECT recyclableWastePassing from regioninfo WHERE time like CONCAT(#{date},'%') order by MONTH(time) asc")
    public List<Long> getRecyclableWastePassing(@Param("date") String date);
    /**
     * 其他垃圾1-12月份的通过率
     * @param date
     * @return
     */
    @Select("SELECT otherWastePassing from regioninfo WHERE time like CONCAT(#{date},'%') order by MONTH(time) asc")
    public List<Long> getOtherWastePassing(@Param("date") String date);

    /**
     *金华各地区1-12月份的学习通过率
     * @param date
     * @return
     */
    @Select("SELECT learnPassing,region,MONTH(time) as time from regioninfo WHERE time like CONCAT(#{date},'%') order by MONTH(time) asc")
    public List<Region> getLearnPassing(@Param("date") String date);

    /**
     * 金华各地区错误率
     * @return
     */
    @Select("SELECT errorPassing,region FROM regioninfo")
    public List<Region> getErrorPassing();

    /**
     * 得到地区
     * @return
     */
    @Select("select DISTINCT region FROM userinfo")
    public List<Region> getRrgion();

    /**
     * 总人数
     * @return
     */
    @Select("select  count(id) from userinfo where region = #{region} ")
    public int getUserAll(String region);

    /**
     * 掌握总人数
     * @return
     */
    @Select("select  count(id) from userinfo where totalQualified = true and region = #{region}")
    public int getAll(String region);


}
