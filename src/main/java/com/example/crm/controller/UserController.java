package com.example.crm.controller;

import com.example.crm.model.User;
import com.example.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @date:2019/5/20
 * @author:felix
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/login")
    @ResponseBody
    public Object login(User user){
        Map map = new HashMap();
        User user1 = userService.login(user);
        if(null == user1){
            map.put("msg",false);
        }else{
            map.put("msg",true);
        }
        return map;
    }
}
