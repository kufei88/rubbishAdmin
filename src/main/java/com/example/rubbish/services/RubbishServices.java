package com.example.rubbish.services;

import com.example.rubbish.POJO.Region;
import com.example.rubbish.mapper.RubbishMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
     * 四种垃圾每一种垃圾1-12月份的通过率
     * @return
     */
    public List<Region> getWastePassing(){
        return rubbishMapper.getWastePassing();
    }

    /**
     * 金华各地区1-12月份的学习通过率
     * @return
     */
    public List<Region> getLearnPassing(){
        return rubbishMapper.getLearnPassing();
    }

    /**
     * 金华各地区错误率
     * @return
     */
    public List<Region> getErrorPassing(){
        return rubbishMapper.getErrorPassing();
    }
}
