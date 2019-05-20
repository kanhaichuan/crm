package com.example.crm.dao;

import com.example.crm.model.DictionaryType;
import com.example.crm.model.DictionaryTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryTypeMapper {
    long countByExample(DictionaryTypeExample example);

    int deleteByExample(DictionaryTypeExample example);

    int deleteByPrimaryKey(String code);

    int insert(DictionaryType record);

    int insertSelective(DictionaryType record);

    List<DictionaryType> selectByExample(DictionaryTypeExample example);

    DictionaryType selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") DictionaryType record, @Param("example") DictionaryTypeExample example);

    int updateByExample(@Param("record") DictionaryType record, @Param("example") DictionaryTypeExample example);

    int updateByPrimaryKeySelective(DictionaryType record);

    int updateByPrimaryKey(DictionaryType record);
}