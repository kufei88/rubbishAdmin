package com.example.rubbish.services;

import com.example.rubbish.POJO.DataReturn;
import com.example.rubbish.POJO.User;
import com.example.rubbish.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyz
 */
@Service
public class UserServices {
    @Autowired
    private UserMapper userMapper;

    /**
     * 处理查询条件和返回条数
     *
     * @param search 查询条件
     * @param start  开始位置
     * @param count  返回条数
     * @return
     */
    public DataReturn getUserList(String search, String start, String count) {
        String searchStr = "".equals(search) ? "" : "where username=" + search + " or telephone=" + search;
        String limitStr = "0".equals(start) && "0".equals(count) ? "" : "limit " + start + "," + count;

        DataReturn dataReturn = new DataReturn();
        dataReturn.setDataCount(userMapper.getUserCount());
        dataReturn.setUserList(userMapper.getUserList(searchStr, limitStr));
        return dataReturn;
    }

    /**
     * 处理删除逻辑
     * @param user 需要删除用户
     * @return 1，删除成功；0，删除失败
     */
    public int deleteUser(User user) {
        int reqCode = 0;
        // 如果删除用户成功，则删除相关考试成绩信息，reqCode为1
        if (userMapper.deleteUser(user) != 0) {
            // 删除用户的相关成绩信息
            userMapper.deleteGrade(user);
            reqCode = 1;
        }
        return reqCode;
    }
}
