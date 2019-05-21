package com.example.crm.service;



import com.example.crm.PaginationVO;
import com.example.crm.model.MarketingActivities;

import java.util.List;
import java.util.Map;

/**
 * @date:2019/5/21
 * @author:felix
 */
public interface MarketingActivitiesService {
    PaginationVO<MarketingActivities> selectByPage(Map map);
}
