package com.example.crm.controller;


import com.example.crm.model.MarketingActivities;
import com.example.crm.service.MarketingActivitiesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @date:2019/5/21
 * @author:felix
 */
@Controller
public class ActivityController {
    private MarketingActivitiesService activitiesService;

    @RequestMapping("/activity/index")
    public String index(MarketingActivities activities ,Integer currentPage, Integer pageSize){
        currentPage = currentPage == null ? 0 : currentPage;
        pageSize = pageSize == null ? 2 : pageSize;
        Map map = new HashMap<>();
        map.put("currentPage",currentPage);
        map.put("pageSize",pageSize);
        map.put("name",activities.getName());

        activitiesService.selectByPage(map);
        return "activity/index";
    }
}
