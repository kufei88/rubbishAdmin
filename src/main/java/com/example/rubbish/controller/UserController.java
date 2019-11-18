package com.example.rubbish.controller;

import com.example.rubbish.POJO.DataReturn;
import com.example.rubbish.POJO.User;
import com.example.rubbish.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zyz
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    public UserServices userServices;

    /**
     * 获取用户信息
     *
     * @param search 查询条件，可为空值
     * @param start  开始位置，不可为空
     * @param count  返回条数，不可为空
     * @return
     */
    @GetMapping("/getUserList")
    public DataReturn getUserList(@RequestParam("search") String search, @RequestParam("start") String start, @RequestParam("count") String count) {
        return userServices.getUserList(search, start, count);
    }

    /**
     * 删除用户信息
     * @param user
     * @return
     */
    @PostMapping("/deleteUser")
    public int deleteUser(@RequestBody User user) {
        return userServices.deleteUser(user);
    }
}
