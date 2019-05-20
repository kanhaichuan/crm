package com.example.crm.dao;

import com.example.crm.model.ContactsActivityRelation;
import com.example.crm.model.ContactsActivityRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactsActivityRelationMapper {
    long countByExample(ContactsActivityRelationExample example);

    int deleteByExample(ContactsActivityRelationExample example);

    int deleteByPrimaryKey(String id);

    int insert(ContactsActivityRelation record);

    int insertSelective(ContactsActivityRelation record);

    List<ContactsActivityRelation> selectByExample(ContactsActivityRelationExample example);

    ContactsActivityRelation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ContactsActivityRelation record, @Param("example") ContactsActivityRelationExample example);

    int updateByExample(@Param("record") ContactsActivityRelation record, @Param("example") ContactsActivityRelationExample example);

    int updateByPrimaryKeySelective(ContactsActivityRelation record);

    int updateByPrimaryKey(ContactsActivityRelation record);
}