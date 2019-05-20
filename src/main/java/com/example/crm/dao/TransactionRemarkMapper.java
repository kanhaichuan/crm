package com.example.crm.dao;

import com.example.crm.model.TransactionRemark;
import com.example.crm.model.TransactionRemarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionRemarkMapper {
    long countByExample(TransactionRemarkExample example);

    int deleteByExample(TransactionRemarkExample example);

    int deleteByPrimaryKey(String id);

    int insert(TransactionRemark record);

    int insertSelective(TransactionRemark record);

    List<TransactionRemark> selectByExample(TransactionRemarkExample example);

    TransactionRemark selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TransactionRemark record, @Param("example") TransactionRemarkExample example);

    int updateByExample(@Param("record") TransactionRemark record, @Param("example") TransactionRemarkExample example);

    int updateByPrimaryKeySelective(TransactionRemark record);

    int updateByPrimaryKey(TransactionRemark record);
}