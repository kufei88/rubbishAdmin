package com.example.rubbish.controller;

import com.example.rubbish.POJO.Region;
import com.example.rubbish.services.RubbishServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
     * 四种垃圾每一种垃圾1-12月份的通过率
     * @return
     */
    @PostMapping("/getWastePassing")
    public List getWastePassing(){
        return rubbishServices.getWastePassing();
    }

    /**
     * 金华各地区1-12月份的学习通过率
     * @return
     */
    @PostMapping("/getLearnPassing")
    public List getLearnPassing(){
        return rubbishServices.getLearnPassing();
    }

    /**
     * 金华各地区错误率
     * @return
     */
    @PostMapping("/getErrorPassing")
    public List getErrorPassing(){
        return rubbishServices.getErrorPassing();
    }
}
