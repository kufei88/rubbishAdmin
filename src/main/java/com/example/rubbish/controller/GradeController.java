package com.example.rubbish.controller;

import com.example.rubbish.POJO.DataReturn;
import com.example.rubbish.POJO.Grade;
import com.example.rubbish.services.GradeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zyz
 */
@RestController
@RequestMapping("grade")
public class GradeController {
    @Autowired
    private GradeServices gradeServices;

    /**
     * 获取用户信息
     *
     * @param search 查询条件，可为空值
     * @param start  开始位置，不可为空
     * @param count  返回条数，不可为空
     * @return
     */
    @GetMapping("/getGradeList")
    public DataReturn getGradeList(@RequestParam("search") String search, @RequestParam("start") String start, @RequestParam("count") String count) {
        return gradeServices.getGradeList(search, start, count);
    }

    /**
     * 删除用户信息
     *
     * @param grade
     * @return
     */
    @PostMapping("/deleteGrade")
    public int deleteGrade(@RequestBody Grade grade) {
        return gradeServices.deleteGrade(grade);
    }

    /**
     * 获取用户的历史成绩
     *
     * @param telephone 该用户的登记手机号码
     * @return
     */
    @PostMapping("/getHistoryGrade")
    public List<Grade> getHistoryGrade(@RequestBody String telephone) {
        return gradeServices.getHistoryGrade(telephone);
    }
}
