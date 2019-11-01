package com.example.rubbish.services;

import com.example.rubbish.POJO.Region;
import com.example.rubbish.mapper.RubbishMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 田易
 */
@Service
public class RubbishServices {
    @Autowired
    private RubbishMapper rubbishMapper;

    /**
     * 查询所有信息
     * @return
     */
    public List<Region> getRegionInfo(){
        return rubbishMapper.getRegionInfo();
    }

    /**
     * 厨余垃圾1-12月份的通过率
     * @return
     */
    public List<Long> getkitchenWastePassing(){
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy");

        return rubbishMapper.getkitchenWastePassing(df.format(new Date()));
    }

    /**
     * 有害垃圾1-12月份的通过率
     * @return
     */
    public List<Long> getHarmfulWastePassing(){
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy");

        return rubbishMapper.getHarmfulWastePassing(df.format(new Date()));
    }
    /**
     * 可回收垃圾1-12月份的通过率
     * @return
     */
    public List<Long> getRecyclableWastePassing(){
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy");

        return rubbishMapper.getRecyclableWastePassing(df.format(new Date()));
    }
    /**
     * 其他垃圾1-12月份的通过率
     * @return
     */
    public List<Long> getOtherWastePassing(){
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy");

        return rubbishMapper.getOtherWastePassing(df.format(new Date()));
    }


    /**
     * 金华各地区1-12月份的学习通过率
     * @return
     */
    public List<Region> getLearnPassing(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        return rubbishMapper.getLearnPassing(df.format(new Date()));
    }

    /**
     * 金华各地区错误率
     * @return
     */
    public List<Region> getErrorPassing(){
        return rubbishMapper.getErrorPassing();
    }

    /**
     * 总人数
     * @return
     */
    public ArrayList getUserAll(){
        ArrayList array = new ArrayList();
        for (Region region : rubbishMapper.getRrgion()){
            ArrayList arrayList = new ArrayList();
            arrayList.add(region.getRegion());
            arrayList.add(rubbishMapper.getUserAll(region.getRegion())/10000);
            array.add(arrayList);
        }
        return array;
    }

    /**
     * 掌握人数
     * @return
     */
    public ArrayList getAll(){
        ArrayList array = new ArrayList();
        for (Region region : rubbishMapper.getRrgion()){
            ArrayList arrayList = new ArrayList();
            arrayList.add(region.getRegion());
            arrayList.add(rubbishMapper.getAll(region.getRegion())/10000);
            array.add(arrayList);
        }
        return array;
    }
}
