package com.example.rubbish.services;

import com.example.rubbish.POJO.Region;
import com.example.rubbish.mapper.RubbishMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubbishServices {
    @Autowired
    private RubbishMapper rM;

    public List<Region> getRegionInfo(){
        return rM.getRegionInfo();
    }

    public List getWastePassing(){
        return rM.getWastePassing();
    }

    public List getLearnPassing(){
        return rM.getLearnPassing();
    }

    public List getErrorPassing(){
        return rM.getErrorPassing();
    }
}
