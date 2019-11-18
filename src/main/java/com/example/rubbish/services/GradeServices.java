package com.example.rubbish.services;

import com.example.rubbish.POJO.DataReturn;
import com.example.rubbish.POJO.Grade;
import com.example.rubbish.mapper.GradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyz
 */
@Service
public class GradeServices {
    @Autowired
    private GradeMapper gradeMapper;

    /**
     * 处理查询条件和返回条数
     *
     * @param search 查询条件
     * @param start  开始位置
     * @param count  返回条数
     * @return
     */
    public DataReturn getGradeList(String search, String start, String count) {
        String searchStr = "".equals(search) ? "" : "and username=" + search + " or telephone=" + search;
        String limitStr = "0".equals(start) && "0".equals(count) ? "" : "limit " + start + "," + count;

        DataReturn dataReturn = new DataReturn();
        dataReturn.setDataCount(gradeMapper.getGradeCount());
        dataReturn.setGradeList(gradeMapper.getGradeList(searchStr, limitStr));
        return dataReturn;
    }

    /**
     * 处理删除逻辑
     * @param grade 需要删除用户
     * @return 1，删除成功；0，删除失败
     */
    public int deleteGrade(Grade grade) {
        int reqCode = 0;
        // 如果删除成功，reqCode为1
        if (gradeMapper.deleteGrade(grade) != 0) {
            reqCode = 1;
        }
        return reqCode;
    }

    /**
     * 获取某用户的所有历史成绩
     * @param telephone 该用户的登录手机号码
     * @return
     */
    public List<Grade> getHistoryGrade(String telephone){
        return gradeMapper.getHistoryGrade(telephone);
    }
}
