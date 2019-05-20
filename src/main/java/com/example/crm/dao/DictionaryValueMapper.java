package com.example.crm.dao;

import com.example.crm.model.DictionaryValue;
import com.example.crm.model.DictionaryValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryValueMapper {
    long countByExample(DictionaryValueExample example);

    int deleteByExample(DictionaryValueExample example);

    int deleteByPrimaryKey(String id);

    int insert(DictionaryValue record);

    int insertSelective(DictionaryValue record);

    List<DictionaryValue> selectByExample(DictionaryValueExample example);

    DictionaryValue selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DictionaryValue record, @Param("example") DictionaryValueExample example);

    int updateByExample(@Param("record") DictionaryValue record, @Param("example") DictionaryValueExample example);

    int updateByPrimaryKeySelective(DictionaryValue record);

    int updateByPrimaryKey(DictionaryValue record);
}