package com.example.rubbish.controller;

import com.example.rubbish.POJO.Region;
import com.example.rubbish.services.RubbishServices;
import net.sf.json.JSONArray;
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
    public JSONArray getKitchenWastePassing(){
        return rubbishServices.getKitchenWastePassing();
    }

    /**
     * 有害垃圾1-12月份的通过率
     * @return
     */
    @PostMapping("/getHarmfulWastePassing")
    public JSONArray getHarmfulWastePassing(){
        return rubbishServices.getHarmfulWastePassing();
    }

    /**
     * 可回收垃圾1-12月份的通过率
     * @return
     */
    @PostMapping("/getRecyclableWastePassing")
    public JSONArray getRecyclableWastePassing(){
        return rubbishServices.getRecyclableWastePassing();
    }

    /**
     * 其他垃圾1-12月份的通过率
     * @return
     */
    @PostMapping("/getOtherWastePassing")
    public JSONArray getOtherWastePassing(){
        return rubbishServices.getOtherWastePassing();
    }

    /**
     * 年龄分布
     * @return
     */
    @PostMapping("/getAgeCrowd")
    public JSONArray getAgeCrowd(){
        return rubbishServices.getAgeCrowd();
    }

    /**
     * 金华各地区1-12月份的学习通过率
     * @return
     */
    @PostMapping("/getLearnPassing")
    public JSONArray getLearnPassing(){
        return rubbishServices.getLearnPassing();
    }

    /**
     * 金华各地区错误率
     * @return
     */
    @PostMapping("/getErrorPassing")
    public JSONArray getErrorPassing(){
        return rubbishServices.getErrorPassing();
    }

    /**
     * 各地区覆盖率
     * @return
     */
    @PostMapping("/getCoverage")
    public JSONArray getCoverage(){
        return rubbishServices.getCoverage();
    }
    /**
     * 地区总人数与掌握人数
     * @return
     */
    @PostMapping("/getUserAll")
    public JSONArray getUserAll(){
        return rubbishServices.getUserAll();
    }

}
