package com.example.crm.dao;

import com.example.crm.model.Transaction;
import com.example.crm.model.TransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionMapper {
    long countByExample(TransactionExample example);

    int deleteByExample(TransactionExample example);

    int deleteByPrimaryKey(String id);

    int insert(Transaction record);

    int insertSelective(Transaction record);

    List<Transaction> selectByExample(TransactionExample example);

    Transaction selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Transaction record, @Param("example") TransactionExample example);

    int updateByExample(@Param("record") Transaction record, @Param("example") TransactionExample example);

    int updateByPrimaryKeySelective(Transaction record);

    int updateByPrimaryKey(Transaction record);
}