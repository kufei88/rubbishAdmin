package com.example.rubbish.mapper;

import com.example.rubbish.POJO.Grade;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zyz
 */
public interface GradeMapper {
    /**
     * 获取数据库的成绩信息
     *
     * @param search 查询条件
     * @param limit  查询的起始位置和返回条数
     * @return
     */
    @Select("SELECT * " +
            "FROM gradeinfo " +
            "WHERE id IN (SELECT MAX(id) FROM gradeinfo GROUP BY telephone) ${search} " +
            "ORDER BY insertTime desc " +
            "${limit}")
    public List<Grade> getGradeList(String search, String limit);

    /**
     * 成绩信息的显示条数
     *
     * @return
     */
    @Select("select count(*) " +
            "from gradeinfo " +
            "WHERE id IN (SELECT MAX(id) FROM gradeinfo GROUP BY telephone)")
    public int getGradeCount();

    /**
     * 删除成绩记录（单一删除）
     * @param grade 需要被删除的用户
     * @return
     */
    @Delete("delete from gradeinfo where id = #{id}")
    public int deleteGrade(Grade grade);

    /**
     * 获取某用户的所有历史成绩
     * @param telephone 用户的登记手机号码
     * @return
     */
    @Select("SELECT * " +
            "FROM gradeinfo " +
            "WHERE telephone = '${telephone}'")
    public List<Grade> getHistoryGrade(String telephone);
}
