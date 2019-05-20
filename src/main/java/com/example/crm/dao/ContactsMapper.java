package com.example.crm.dao;

import com.example.crm.model.Contacts;
import com.example.crm.model.ContactsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactsMapper {
    long countByExample(ContactsExample example);

    int deleteByExample(ContactsExample example);

    int deleteByPrimaryKey(String id);

    int insert(Contacts record);

    int insertSelective(Contacts record);

    List<Contacts> selectByExample(ContactsExample example);

    Contacts selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Contacts record, @Param("example") ContactsExample example);

    int updateByExample(@Param("record") Contacts record, @Param("example") ContactsExample example);

    int updateByPrimaryKeySelective(Contacts record);

    int updateByPrimaryKey(Contacts record);
}