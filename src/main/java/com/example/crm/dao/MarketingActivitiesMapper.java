package com.example.crm.dao;

import com.example.crm.model.MarketingActivities;
import com.example.crm.model.MarketingActivitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketingActivitiesMapper {
    long countByExample(MarketingActivitiesExample example);

    int deleteByExample(MarketingActivitiesExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketingActivities record);

    int insertSelective(MarketingActivities record);

    List<MarketingActivities> selectByExample(MarketingActivitiesExample example);

    MarketingActivities selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketingActivities record, @Param("example") MarketingActivitiesExample example);

    int updateByExample(@Param("record") MarketingActivities record, @Param("example") MarketingActivitiesExample example);

    int updateByPrimaryKeySelective(MarketingActivities record);

    int updateByPrimaryKey(MarketingActivities record);
}