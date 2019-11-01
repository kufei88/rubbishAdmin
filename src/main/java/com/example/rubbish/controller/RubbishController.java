package com.example.rubbish.controller;

import com.example.rubbish.POJO.Region;
import com.example.rubbish.services.RubbishServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 田易
 */
@RestController
@RequestMapping("rubbish")
public class RubbishController {

    @Autowired
    private RubbishServices rubbishServices;

    /**
     * 查询所有信息
     * @return
     */
    @PostMapping("/getRegionInfo")
    public List<Region> getRegionInfo(){
        return rubbishServices.getRegionInfo();
    }

    /**
     * 厨余垃圾1-12月份的通过率
     * @return
     */
    @PostMapping("/getkitchenWastePassing")
    public List<Long> getkitchenWastePassing(){
        return rubbishServices.getkitchenWastePassing();
    }

    /**
     * 有害垃圾1-12月份的通过率
     * @return
     */
    @PostMapping("/getHarmfulWastePassing")
    public List<Long> getHarmfulWastePassing(){
        return rubbishServices.getHarmfulWastePassing();
    }

    /**
     * 可回收垃圾1-12月份的通过率
     * @return
     */
    @PostMapping("/getRecyclableWastePassing")
    public List<Long> getRecyclableWastePassing(){
        return rubbishServices.getRecyclableWastePassing();
    }

    /**
     * 其他垃圾1-12月份的通过率
     * @return
     */
    @PostMapping("/getOtherWastePassing")
    public List<Long> getOtherWastePassing(){
        return rubbishServices.getOtherWastePassing();
    }
    /**
     * 金华各地区1-12月份的学习通过率
     * @return
     */
    @PostMapping("/getLearnPassing")
    public List<Region> getLearnPassing(){
        return rubbishServices.getLearnPassing();
    }

    /**
     * 金华各地区错误率
     * @return
     */
    @PostMapping("/getErrorPassing")
    public List<Region> getErrorPassing(){
        return rubbishServices.getErrorPassing();
    }

    /**
     * 总人数
     * @return
     */
    @PostMapping("/getUserAll")
    public ArrayList getUserAll(){
        return rubbishServices.getUserAll();
    }

    /**
     * 掌握总人数
     * @return
     */
    @PostMapping("/getAll")
    public ArrayList getAll(){
        return rubbishServices.getAll();
    }
}
