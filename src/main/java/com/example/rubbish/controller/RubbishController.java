package com.example.rubbish.controller;

import com.example.rubbish.POJO.Region;
import com.example.rubbish.services.RubbishServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rubbish")
public class RubbishController {

    @Autowired
    private RubbishServices rS;

    @PostMapping("/getRegionInfo")
    public List<Region> getRegionInfo(){
        return rS.getRegionInfo();
    }

    /**
     * 四种垃圾每一种垃圾1-12月份的通过率
     * @return
     */
    @PostMapping("/getWastePassing")
    public List getWastePassing(){
        return rS.getWastePassing();
    }

    /**
     * 金华各地区1-12月份的学习通过率
     * @return
     */
    @PostMapping("/getLearnPassing")
    public List getLearnPassing(){
        return rS.getLearnPassing();
    }

    /**
     * 金华各地区错误率
     * @return
     */
    @PostMapping("/getErrorPassing")
    public List getErrorPassing(){
        return rS.getErrorPassing();
    }
}