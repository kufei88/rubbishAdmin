package com.example.rubbish.mapper;

import com.example.rubbish.POJO.Region;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RubbishMapper {
    /**
     *
            * @return
            */
    @Select("select * from regioninfo")
    public List<Region> getRegionInfo();

    /**
     * 四种垃圾每一种垃圾1-12月份的通过率
     * @return
     */
    @Select("SELECT kitchenWastePassing,harmfulWastePassing,recyclableWastePassing,otherWastePassing from regioninfo WHERE time order by MONTH(time) asc")
    public List getWastePassing();

    /**
     *金华各地区1-12月份的学习通过率
     * @return
     */
    @Select("SELECT learnPassing,region from regioninfo WHERE time order by MONTH(time) asc")
    public List getLearnPassing();




    /**
     * 金华各地区错误率
     * @return
     */
    @Select("SELECT errorPassing,region FROM regioninfo")
    public List getErrorPassing();
}
