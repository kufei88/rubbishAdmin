package com.example.rubbish.mapper;

import com.example.rubbish.POJO.Region;
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
    @Select("SELECT kitchenWastePassing,harmfulWastePassing,recyclableWastePassing,otherWastePassing,time from regioninfo WHERE time order by MONTH(time) asc")
    public List<Region> getWastePassing();

    /**
     *金华各地区1-12月份的学习通过率
     * @return
     */
    @Select("SELECT learnPassing,region,time from regioninfo WHERE time order by MONTH(time) asc")
    public List<Region> getLearnPassing();

    /**
     * 金华各地区错误率
     * @return
     */
    @Select("SELECT errorPassing,region FROM regioninfo")
    public List<Region> getErrorPassing();
}
