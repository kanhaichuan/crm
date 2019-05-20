package com.example.crm.dao;

import com.example.crm.model.TaskRemark;
import com.example.crm.model.TaskRemarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskRemarkMapper {
    long countByExample(TaskRemarkExample example);

    int deleteByExample(TaskRemarkExample example);

    int deleteByPrimaryKey(String id);

    int insert(TaskRemark record);

    int insertSelective(TaskRemark record);

    List<TaskRemark> selectByExample(TaskRemarkExample example);

    TaskRemark selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TaskRemark record, @Param("example") TaskRemarkExample example);

    int updateByExample(@Param("record") TaskRemark record, @Param("example") TaskRemarkExample example);

    int updateByPrimaryKeySelective(TaskRemark record);

    int updateByPrimaryKey(TaskRemark record);
}