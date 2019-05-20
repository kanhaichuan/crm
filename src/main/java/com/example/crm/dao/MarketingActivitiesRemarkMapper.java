package com.example.crm.dao;

import com.example.crm.model.MarketingActivitiesRemark;
import com.example.crm.model.MarketingActivitiesRemarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketingActivitiesRemarkMapper {
    long countByExample(MarketingActivitiesRemarkExample example);

    int deleteByExample(MarketingActivitiesRemarkExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketingActivitiesRemark record);

    int insertSelective(MarketingActivitiesRemark record);

    List<MarketingActivitiesRemark> selectByExample(MarketingActivitiesRemarkExample example);

    MarketingActivitiesRemark selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketingActivitiesRemark record, @Param("example") MarketingActivitiesRemarkExample example);

    int updateByExample(@Param("record") MarketingActivitiesRemark record, @Param("example") MarketingActivitiesRemarkExample example);

    int updateByPrimaryKeySelective(MarketingActivitiesRemark record);

    int updateByPrimaryKey(MarketingActivitiesRemark record);
}