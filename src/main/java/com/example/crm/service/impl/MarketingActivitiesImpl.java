package com.example.crm.service.impl;

import com.example.crm.PaginationVO;
import com.example.crm.dao.MarketingActivitiesMapper;
import com.example.crm.model.MarketingActivities;
import com.example.crm.service.MarketingActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @date:2019/5/21
 * @author:felix
 */
public class MarketingActivitiesImpl implements MarketingActivitiesService {

    @Autowired
    private MarketingActivitiesMapper activitiesMapper;

    @Override
    public PaginationVO<MarketingActivities> selectByPage(Map map) {
        Integer total = activitiesMapper.selectTotal();
        List dataList = activitiesMapper.selectActivityByPage(map);
        return null;
    }
}
