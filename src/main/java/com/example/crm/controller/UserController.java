package com.example.crm.controller;

import com.example.crm.model.User;
import com.example.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    public Object login(User user, HttpSession session){
        Map map = new HashMap();
        User user1 = userService.login(user);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();
        String dateStr = sdf.format(date);
        if(null == user1){
            map.put("msg","请输入正确的用户名和密码");
        }else if(user1.getExpireTime().compareToIgnoreCase(dateStr) < 0){
            map.put("msg","用户受限");
        }else{
            session.setAttribute("user",user1);
            map.put("msg",true);
        }

        return map;
    }
}
