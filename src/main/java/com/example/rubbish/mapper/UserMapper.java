package com.example.rubbish.mapper;

import com.example.rubbish.POJO.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zyz
 */
public interface UserMapper {
    /**
     * 获取数据库的用户信息
     *
     * @param search 查询条件
     * @param limit  查询的起始位置和返回条数
     * @return
     */
    @Select("select * " +
            "from userinfo " +
            "${search} " +
            "ORDER BY insertTime desc " +
            "${limit}")
    public List<User> getUserList(String search, String limit);

    /**
     * 用户信息的总条数
     *
     * @return
     */
    @Select("select count(*) from userinfo ")
    public int getUserCount();

    /**
     * 删除用户（单一删除）
     * @param user 需要被删除的用户
     * @return
     */
    @Delete("delete from userinfo " +
            "where id = #{id}")
    public int deleteUser(User user);

    /**
     * 删除用户的所有成绩
     * @param user 需要被删除的用户
     * @return
     */
    @Delete("delete from gradeinfo " +
            "where username=#{username} " +
            "and telephone=#{telephone}")
    public int deleteGrade(User user);
}
